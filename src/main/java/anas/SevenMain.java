package anas;

import models.Rectangle;

public class SevenMain {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10, 10, 10, 10, null);
        System.out.println(r1);


        r1.update(89);
        System.out.println(r1);
        
        r1.update(89, 2.0);
        System.out.println(r1);

        r1.update(89, 2.0, 3.0);
        System.out.println(r1);

        r1.update(89, 2.0, 3.0, 4);
        System.out.println(r1);

        r1.update(89, 2.0, 3.0, 4, 5);
        System.out.println(r1);
    }
}
