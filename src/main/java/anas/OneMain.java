package anas;

import models.Rectangle;

public class OneMain {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10, 2);
        System.out.println(r1.getId());

        Rectangle r2 = new Rectangle(2, 10);
        System.out.println(r2.getId());

        Rectangle r3 = new Rectangle(10, 2, 0, 0, 12);
        System.out.println(r3.getId());

        
    }
}
