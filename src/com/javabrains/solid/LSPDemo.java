package com.javabrains.solid;

/**
 * https://dzone.com/articles/solid-principles-liskov-substitution-principle?fromrel=true
 *
 * example not implemented as yet
 */

public class LSPDemo {

    public void calculateArea(Rectangle r) {
        r.setBreadth(2);
        r.setLength(3);
        //
        // Assert Area
        //
        // From the code, the expected behavior is that
        // the area of the rectangle is equal to 6
        //

        System.out.println("Area:"+r.getArea());
        //
        // Assert Length & Breadth
        //
        // From the code, the expected behavior is that
        // the length should always be equal to 3 and
        // the breadth should always be equal to 2
        //
        System.out.println("Length:"+r.getLength());

        if(r.getLength() != 3)
        {

        }

        System.out.println("Breadth:"+r.getBreadth());

    }

    private String printError(String errorIdentifer, Rectangle r) {
        return "Unexpected value of " + errorIdentifer + "  for instance of " + r.getClass().getName();
    }

    public static void main(String[] args) {
        LSPDemo lsp = new LSPDemo();
        //
        // An instance of Rectangle is passed
        //
  //      lsp.calculateArea(new Rectangle());
        //
        // An instance of Square is passed
        //
       lsp.calculateArea(new Square());
    }
}
