package com.pluralsight;

public class House extends Asset{
    private String address;
    private int condition; // 1-excellent, 2- good, 3- fair, 4- poor
    private int squareFoot;
    private int lotSize;

    public House(){

    }

    public House(String description, String dateAcquired, double originalCost,
                 String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){
        double pricePerSquareFoot = 0;

        if(condition == 1) {
            pricePerSquareFoot = 180.00;
        } else if(condition == 2){
            pricePerSquareFoot = 130.00;
        } else if (condition == 3) {
            pricePerSquareFoot = 90.00;
        } else if (condition == 4) {
            pricePerSquareFoot = 80.00;
        } else {
            System.out.println("No conditions set");
        }

        double houseValue = pricePerSquareFoot * squareFoot;
        double lotValue = 0.25 * lotSize;
        return houseValue + lotValue;

    }
}