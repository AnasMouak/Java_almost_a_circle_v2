package anas;

import java.util.HashMap;
import java.util.Map;

import models.Square;

public class ElevenMain {
    public static void main(String[] args) {
        // Create a new Rectangle instance
        Square sqr = new Square(4.0, 1, 1, 100);
        System.out.println("Initial square: " + sqr);

        // Update using positional arguments
        System.out.println("\nUpdating square with positional arguments:");
        sqr.update(101, 5.0, 2, 2);
        System.out.println("Updated square: " + sqr);

        // Update using a Map
        System.out.println("\nUpdating square using a Map:");
        Map<String, Object> updateMap = new HashMap<>();
        updateMap.put("side", 6.0);
        updateMap.put("x", 3);
        updateMap.put("y", 3);
        updateMap.put("id", 102);

        sqr.update(updateMap);
        System.out.println("Updated square: " + sqr);
    }
}
