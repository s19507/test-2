package com.company;

public interface Work {
void start() throws EngineRunning;
void stop () throws EngineRunning;
void refuel();
void refuel(int Tank);

    class EngineRunning extends Exception {
    }
}
