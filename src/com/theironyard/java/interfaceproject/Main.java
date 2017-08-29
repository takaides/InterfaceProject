package com.theironyard.java.interfaceproject;

public class Main {

    public static void main(String[] args) {
        Seal fred = new Seal("Fred", "Maj Gnnr Sgt", 4377575);
        Pilot tom = new Pilot("Tom", "Captain", 980234);
        Marine jane = new Marine("Jane", "PFC", 892349);


        System.out.println(fred.getName());
        System.out.println(fred.getRank());
        System.out.println(fred.getSerialNumber());
        System.out.println(fred.speak());
        System.out.println(fred.shoot());
        System.out.println(fred.walk());
        System.out.println(fred.eat());
        System.out.println(fred.sleep());
        System.out.println(fred.radio());
        System.out.println(fred.boom());

        System.out.println(tom.getName());
        System.out.println(tom.getRank());
        System.out.println(tom.getSerialNumber());
        System.out.println(tom.speak());
        System.out.println(tom.shoot());
        System.out.println(tom.walk());
        System.out.println(tom.eat());
        System.out.println(tom.sleep());
        System.out.println(tom.radio());
        System.out.println(tom.boom());

        System.out.println(jane.getName());
        System.out.println(jane.getRank());
        System.out.println(jane.getSerialNumber());
        System.out.println(jane.speak());
        System.out.println(jane.shoot());
        System.out.println(jane.walk());
        System.out.println(jane.eat());
        System.out.println(jane.sleep());
        System.out.println(jane.radio());
        System.out.println(jane.boom());
    }
}
