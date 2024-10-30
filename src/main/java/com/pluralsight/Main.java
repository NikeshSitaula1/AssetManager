package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        House h1 = new House();
        House h2 = new House();

        assets.add(h1);
        assets.add(h2);


        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();

        assets.add(v1);
        assets.add(v2);

        double networth = 0;
        for(Asset a : assets){
            System.out.println(a.getDescription() + " Acquired on " + a.getDateAcquired() + " for "
                    + a.getDateAcquired() + " is now worth: " + (networth += a.getValue()));
        }

    }

}