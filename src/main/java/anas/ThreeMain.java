package anas;

import models.Rectangle;

public class ThreeMain {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10, 2);
        System.out.println(r1.getArea());

        Rectangle r2 = new Rectangle(2, 11);
        System.out.println(r2.getArea());

        Rectangle r3 = new Rectangle(20, 2, 0, 0, 12);
        System.out.println(r3.getArea());

        
    }
}
