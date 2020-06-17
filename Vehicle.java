package com.company;

public class Vehicle {
    double refueling;
    double swimming;
    String engineState;
    String Drive;
    public void start(){
        if(this.engineState == "on"){
            System.out.println("Engine is already on");
        }else{
            this.setEngineState ("on");
            System.out.println("engine is on");
        }
    }
    public void stop(){
        if(this.engineState == "off"){
            System.out.println("Engine is already off");
        }else{
            this.setEngineState("off");
            System.out.println("engine is off");
        }
    }

    public String getEngineState() {
        return engineState;
    }

    public void setEngineState(String engineState) {
        this.engineState = engineState;
    }

    public double getSwimming() {
        return swimming;
    }

    public void setSwimming(double swimming) {
        this.swimming = swimming;
    }

    public double getRefueling() {
        return refueling;
    }

    public void setRefueling(double refueling) {
        this.refueling = refueling;
    }

    public String getDrive() {
        return Drive;
    }

    public void setDrive(String drive) {
        Drive = drive;
    }
}
