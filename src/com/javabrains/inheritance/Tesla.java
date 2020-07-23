package com.javabrains.inheritance;

public class Tesla implements AutomatingDriving, SimulatedDriving {

    @Override
    public void startTheEngine() {
        System.out.println("Tesla ");
    }

    @Override
    public void chooseBaseAPI() {


        System.out.println("Mandatory to implement a common method");
    }


}
