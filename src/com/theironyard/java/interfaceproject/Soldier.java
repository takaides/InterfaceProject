package com.theironyard.java.interfaceproject;

abstract class Soldier implements Shoot, Explosion, Airstrike {
    private String name;
    private String rank;
    private int serialNumber;

    public Soldier(String name, String rank, int serialNumber) {
        this.name = name;
        this.rank = rank;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String sleep() {
        return "ZZZZZZZZ";
    }

    public String eat() {
        return "Nom nom nom";
    }

    public String walk() {
        return "trudge";
    }

    abstract String speak();

    @Override
    public String radio() {
        return "Bad guy over there! BOOM!";
    }

    @Override
    public String boom() {
        return "Fire in the hole!";
    }

    @Override
    public String shoot() {
        return "Bang Bang!";
    }
}
