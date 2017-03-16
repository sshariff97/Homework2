package com.company;


/**
 * Created by Sakina on 3/10/17.
 */
public class Vehicle {

    public double fuel;
    public double mpg;
    public int currentSpeed;
    public double baseMpg;
    public double scaleFactor;

    public double getUpdateFuel() {
        return updateFuel;
    }

    public void setUpdateFuel(double updateFuel) {
        this.updateFuel = updateFuel;
    }

    public double updateFuel;



    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getBaseMpg() {
        return baseMpg;
    }

    public void setBaseMpg(double baseMpg) {
        this.baseMpg = baseMpg;
    }

    public double getScaleFactor() {
        return scaleFactor;
    }

    public void setScaleFactor(double scaleFactor) {
        this.scaleFactor = scaleFactor;
    }



    public void updateMpg() {
        mpg = baseMpg - scaleFactor * currentSpeed + Math.exp(currentSpeed/20)*0.01;

    }

}

