package com.javabrains.inheritance;

public interface AutomatingDriving {

    void startTheEngine();

    default void chooseBaseAPI()
    {
        System.out.println("Java is selected");
    }
}
