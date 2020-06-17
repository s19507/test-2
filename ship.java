package com.company;

public abstract class ship extends vehicles {
    public ship(int tankcapacity, int places) {
        super(tankcapacity, places);}
        public void swimming (int x, int y) {
            if (x > 0 && y > 0) {
                System.out.println("The Ship is Swimming to (" + x+ "," + y +")");
            } else System.out.println("Can not found target coordinates");
        }
    }
