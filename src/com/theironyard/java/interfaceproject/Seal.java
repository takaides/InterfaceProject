package com.theironyard.java.interfaceproject;

public class Seal extends Soldier {
    @Override
    String speak() {
        return "* Silence *";
    }

    public Seal(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }
}
