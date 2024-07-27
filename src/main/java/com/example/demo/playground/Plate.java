package com.example.demo.playground;

public class Plate {
    String plateNumber;

    public Plate(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public String toString() {
        return plateNumber;
    }
}
