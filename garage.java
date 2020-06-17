package com.company;

import java.util.ArrayList;
import java.util.List;

public class garage {
    public int capacity;
    List<car> carList = new ArrayList();

    public void addCar( car x) throws carextension {
        if (carList.size() == capacity)
            throw new carextension() {};
        carList.add(x);
    }
}
