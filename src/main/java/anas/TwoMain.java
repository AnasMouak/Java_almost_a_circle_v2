package anas;

import models.Rectangle;

public class TwoMain {
    public static void main(String[] args) {
        
        try {
            Rectangle r2 = new Rectangle(10, 2);
            r2.setWidth(-10);  // Should throw IllegalArgumentException
        } catch (Exception e) {
            System.out.println("[" + e.getClass().getSimpleName() + "] " + e.getMessage());
        }

        try {
            Rectangle r3 = new Rectangle(10, 2);
            r3.setHeight(-10);  // Should throw IllegalArgumentException
        } catch (Exception e) {
            System.out.println("[" + e.getClass().getSimpleName() + "] " + e.getMessage());
        }

        try {
            Rectangle r4 = new Rectangle(10, 2, 2, 0, 12);
            r4.setX(-10);  // Should throw IllegalArgumentException
        } catch (Exception e) {
            System.out.println("[" + e.getClass().getSimpleName() + "] " + e.getMessage());
        }

        try {
            new Rectangle(10, 2, 10, 0, 12);  // Should throw IllegalArgumentException
        } catch (Exception e) {
            System.out.println("[" + e.getClass().getSimpleName() + "] " + e.getMessage());
        }


    }
}