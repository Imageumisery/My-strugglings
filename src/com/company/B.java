package com.company;

public class B implements IRead {
    private String s = "Fuck you!";
    @Override
    public String read() {
       return this.s;
    }
    public void print () {
        System.out.println(this.s);
    }
}
