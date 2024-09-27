package anas;

import models.Square;

public class TenMain {
    public static void main(String[] args) {
        // Create a Square instance
        Square s1 = new Square(5);
        System.out.println(s1);
        System.out.println("Size: " + s1.getSide());

        // Update the size
        s1.setSide(10);
        System.out.println(s1);

        // Attempt to set an invalid size
        try {
            s1.setSide(-2);  // This should trigger an exception
        } catch (Exception e) {
            System.out.println("[" + e.getClass().getSimpleName() + "] " + e.getMessage());
        }
    }
}
