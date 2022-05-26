package com.company;

public class D  {
    private Iwrite a;
    private IRead b;
    private String str = "";

    public D(Iwrite a, IRead b) {
        this.a = a;
        this.b = b;
        this.str = b.read();
    }
   public void print (String str) {
        this.str = str.substring(2);
       System.out.println(str);
   }
}
