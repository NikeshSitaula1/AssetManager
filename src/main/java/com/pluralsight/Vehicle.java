package com.pluralsight;

public class Vehicle extends Asset{

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(){

    }

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        int vehicleAge = 2024 - year;

        double reducedValue = 0;

        if (vehicleAge <= 3) {
            reducedValue = 0.03 * vehicleAge;
        } else if (vehicleAge >= 4 && vehicleAge <= 6) {
            reducedValue = 0.06 * vehicleAge;
        } else if (vehicleAge >= 7 && vehicleAge <= 10) {
            reducedValue = 0.08 * vehicleAge;
        } else if (vehicleAge > 10) { //if 10+ years
            return 1000;
        }

        double currentValue = getOriginalCost() * (1 - reducedValue);

        if (odometer > 100000 && !makeModel.toLowerCase().contains("honda") &&
                !makeModel.toLowerCase().contains("toyota")) {
            currentValue *= 0.75;
        }
        return currentValue;
    }

}
