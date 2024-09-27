package anas;

import models.Rectangle;

public class SixMain {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(2, 3, 2, 2, null);
        r1.Display();

        System.out.println("---");

        Rectangle r2 = new Rectangle(3, 2, 1, 0, null);
        r2.Display();
        
    }
}
