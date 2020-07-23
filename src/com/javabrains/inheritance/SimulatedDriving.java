package com.javabrains.inheritance;

public interface SimulatedDriving {

    default void chooseBaseAPI()
    {
        System.out.println("C++ is selected");
    }
}
