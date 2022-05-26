package com.company.gotcha;

public class Electrocar {
    private int id;
    String name;
    boolean charge;
    int miles;

    public Electrocar(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private class Motor {
        public void startMotor () {
            System.out.println("Motor" + name + "is starting...");
        }
    }

    public boolean charge (boolean charge) {
        if (miles == 200) {
            charge = false;
            System.out.println("EV needs to be charged");
        }
        else charge = true;
        System.out.println(name + "is charging...");
        return charge;
    }

    public void start () {
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("Motor is started");
        if (charge) {
            System.out.println("EV is already charged!");
        }
    }
}
