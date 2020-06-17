package com.company;

public abstract class vehicles implements Work {
    int tankcapacity;
    boolean fulltank;
    int places;
    boolean checkEngine;

    public vehicles (int tankcapacity, int places){
        this.tankcapacity = tankcapacity;
        this.places = places;
        this.checkEngine = false;

    }
    @Override
    public void start() throws EngineRunning{
        if(this.checkEngine == true)
            throw new EngineRunning();
    }
    public void stop () throws EngineRunning{
        if(this.checkEngine == false)
            throw new EngineRunning();
    }
    public void refuel(int Tank){
        if (Tank > this.tankcapacity){
            this.fulltank = true;
            System.out.println(" No refuel more than "+ this.tankcapacity +" litre");
        }else this.fulltank = false;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    protected boolean getcheckEngine() {
        return this.checkEngine;
    }
}
