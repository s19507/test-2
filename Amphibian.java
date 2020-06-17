package com.company;

public class Amphibian implements Task {
    @Override
    public void swimming() {
        System.out.println("flow");

    }

    @Override
    public void Driving() {
        System.out.println("goes");

    }

    @Override
    public void Stop() {
        System.out.println("stop");

    }
}
