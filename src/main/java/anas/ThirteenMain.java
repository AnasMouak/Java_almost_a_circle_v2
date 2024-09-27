package anas;

import java.util.Collections;
import java.util.Map;

import models.Rectangle;
import models.Base;

public class ThirteenMain {
    public static void main(String[] args) {
        // Create a Rectangle instance
        Rectangle r1 = new Rectangle(10.0, 7.0, 2, 8, null);
        
        // Convert Rectangle to dictionary (Map)
        Map<String, Object> dictionary = r1.toDict();
        
        // Convert the dictionary to JSON string
        String jsonDictionary = Base.toJsonString(Collections.singletonList(dictionary));
        
        // Print results
        System.out.println(dictionary);
        System.out.println(dictionary.getClass().getName());
        System.out.println(jsonDictionary);
        System.out.println(jsonDictionary.getClass().getName());
    }
}
