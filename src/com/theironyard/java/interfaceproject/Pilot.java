package com.theironyard.java.interfaceproject;

public class Pilot extends Soldier {
    @Override
    String speak() {
        return "Tower. Requesting permission to land. OVER!";
    }

    public Pilot(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }
}
