package com.example.demo.playground;

public class Main {

    public static void main(String[] args) {
        String s1 = "s1";
        String s2 = "s2";

        int int1 = 1;
        int int2 = 2;

        Plate plate1 = new Plate("1");
        Plate plate2 = new Plate("2");

        System.out.println("s1=" + s1);
        System.out.println("s2=" + s2);

        System.out.println("int1=" + int1);
        System.out.println("int2=" + int2);

        System.out.println("--------------------");

        swapStrings(s1, s2);
        swapInts(int1, int2);
        swapPlates(plate1, plate2);

        System.out.println("s1=" + s1);
        System.out.println("s2=" + s2);

        System.out.println("int1=" + int1);
        System.out.println("int2=" + int2);

        System.out.println("plate1=" + plate1);
        System.out.println("plate2=" + plate2);

    }

    public static void swapStrings(String s1, String s2){
        s1+="*";
        s2+="*";
    }

    public static void swapInts(int int1, int int2){ // By value (Copy)
        int1+=100;
        int2+=100;
        System.out.println("Copy if int1=" + int1);
        System.out.println("Copy if int2=" + int2);
    }

    public static void swapPlates(Plate plate1, Plate plate2){ //By reference
        plate1.plateNumber += "****";
        plate2.plateNumber += "****";
    }

}
