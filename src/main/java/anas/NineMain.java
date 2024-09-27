package anas;

import models.Square;

public class NineMain {

    private static final String AREA_LABELL_STRING = "Area: ";
    public static void main(String[] args) {
        Square s1 = new Square(5);
        System.out.println(s1);
        System.out.println(AREA_LABELL_STRING + s1.getArea());
        s1.Display();
        
        System.out.println("---");
        
        Square s2 = new Square(2, 2, 0, null);
        System.out.println(s2);
        System.out.println(AREA_LABELL_STRING + s2.getArea());
        s2.Display();

        System.out.println("---");

        Square s3 = new Square(3, 1, 3, null);
        System.out.println(s3);
        System.out.println(AREA_LABELL_STRING + s3.getArea());
        s3.Display();
    }
}
