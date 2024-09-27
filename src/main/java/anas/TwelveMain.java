package anas;

import java.util.Map;
import models.Rectangle;
import models.Square;

public class TwelveMain {
    public static void main(String[] args) {
        // Create first Rectangle instance
        Rectangle r1 = new Rectangle(4.0, 2.0, 1, 1, null);
        System.out.println(r1);

        // Convert r1 to a dictionary
        Map<String, Object> r1Dictionary = r1.toDict();
        System.out.println(r1Dictionary);
        System.out.println(r1Dictionary.getClass().getName());

        // Create second Rectangle instance
        Rectangle r2 = new Rectangle(1, 1);
        System.out.println(r2);

        // Update r2 with r1's dictionary
        r2.update(r1Dictionary);
        System.out.println(r2);

        // Check if r1 and r2 are equal
        System.out.println(r1.equals(r2));

        // Create a Square instance
        Square s1 = new Square(4.0, 1, 1, null);
        System.out.println(s1);

        // Convert s1 to a dictionary
        Map<String, Object> s1Dictionary = s1.toDict();
        System.out.println(s1Dictionary);
        System.out.println(s1Dictionary.getClass().getName());

        // Create a Square instance
        Square s2 = new Square(1);
        System.out.println(s2);

        // Update s2 with s1's dictionary
        s2.update(s1Dictionary);
        System.out.println(s2);

        // Check if s1 and s2 are equal
        System.out.println(s1.equals(s2));
    }
}
