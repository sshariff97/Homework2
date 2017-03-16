package com.company;


/**
 * Created by Sakina on 3/10/17.
 */
public class Car extends Vehicle {
    private String make;
    private String model;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }




    public void updateFuelRemaining(double timeTravelled) {
        updateFuel = fuel - (currentSpeed*timeTravelled)/this.mpg;
    }


}

