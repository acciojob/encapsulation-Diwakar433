package com.driver;

public class Main {

    public static void main(String arg[]) {
        RWOnly obj = new RWOnly();

//        obj.name = "Diwakar";
//        System.out.prntln(obj.name);

        obj.setName("Diwakar Sharma");
        System.out.println(obj.getName());
    }
}