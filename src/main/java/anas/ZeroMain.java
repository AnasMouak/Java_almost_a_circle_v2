package anas;

import models.Base;

public class ZeroMain {
    public static void main(String[] args) {

        Base b1 = new Base();
        System.out.println(b1.getId());

        Base b2 = new Base();
        System.out.println(b2.getId());

        Base b3 = new Base();
        System.out.println(b3.getId());

        Base b4 = new Base(12);
        System.out.println(b4.getId());

        Base b5 = new Base();
        System.out.println(b5.getId());
    }
    
}
