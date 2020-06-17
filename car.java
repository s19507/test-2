package com.company;

public abstract class car extends vehicles {
    public int Speed;
    public boolean checkEngine;
    public boolean getcheckEngine(){
        return super.getcheckEngine();
    }
    public car (int tankcapacity, int places, int Speed){
        super(tankcapacity, places);
        this.Speed = Speed;
    }
    public void Driving(){
        if(this.checkEngine == true)
            System.out.println("it is driving");
        else System.out.println("stop");
    }
}
