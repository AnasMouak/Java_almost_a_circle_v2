package anas;

import java.util.HashMap;
import java.util.Map;

import models.Rectangle;

public class EightMain {
    public static void main(String[] args) {
        // Create a new Rectangle instance
        Rectangle rect = new Rectangle(4.0, 2.0, 1, 1, 100);
        System.out.println("Initial rectangle: " + rect);

        // Update using positional arguments
        System.out.println("\nUpdating rectangle with positional arguments:");
        rect.update(101, 5.0, 3.0, 2, 2);
        System.out.println("Updated rectangle: " + rect);

        // Update using a Map
        System.out.println("\nUpdating rectangle using a Map:");
        Map<String, Object> updateMap = new HashMap<>();
        updateMap.put("width", 6.0);
        updateMap.put("height", 4.0);
        updateMap.put("x", 3);
        updateMap.put("y", 3);
        updateMap.put("id", 102);

        rect.update(updateMap);
        System.out.println("Updated rectangle: " + rect);
    }
}