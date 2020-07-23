package com.javabrains.solid;

public class Square extends Rectangle {

    @Override
    public void setBreadth(int breadth) {

        System.out.println("I am called");
        super.setBreadth(breadth);
        super.setLength(breadth);
    }
    @Override
    public void setLength(int length) {

        System.out.println("I am called");
        super.setLength(length);
        super.setBreadth(length);
    }


}
