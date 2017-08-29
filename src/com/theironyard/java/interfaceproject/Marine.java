package com.theironyard.java.interfaceproject;

public class Marine extends Soldier {
    @Override
    String speak() {
        return "Hoo-Rah!";
    }

    public Marine(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }
}
