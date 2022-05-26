package com.company;

import java.nio.charset.StandardCharsets;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

//A a = new A();
//a.write("567");
//IRead a1 = new B();
//Iwrite b2 = new C();
//IRead c1 = new B();
//D d = new D(b2, a1);
//d.print("34");



        Person P1 = new Person("Shakhzod", "Rizayev", 5656,24);
        Person P2 = new Person("Rashid", "Abdurahmonov", 5456,26 );
        Person.howl();
        Person.work();
        Person.printCount();


        for (int i = 1; i < P1.getFirstName().length(); i++) {
            if (i == (P1.getFirstName().length()) - 1) {
                break;
            }
            System.out.println(P1.getFirstName().substring(0,i + 2));
        }
        List <String> Animals = new ArrayList<>();
        Animals.add("Goat");
        Animals.add("Tiger");
        Animals.add("Eagle");
        System.out.println(Animals.get(2));




//      /*  char ch1 = 2569;
//
//        String gotName = "gotNameeeee";
//        System.out.println(gotName);
//        System.out.println(gotName.replaceAll("e","I"));
//        System.out.println((int)ch1);*/
//      /*  gotName.toParse*/
///*        public int solution (int number) {
//            for(int i = 0; i > number; i++) {
//                if (number % 3 == 0 && number % 5 == 0) {
//                    int [] number1 = new int[];
//                }
//                 if (number == 0) {
//                     return 0;
//                 }
//                }
//            }*/
//       int [] arr = {2,5,7,9,10};
//       boolean [] arr2 = new boolean[4];
//       String [] arr3 = new String[5];
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));
//
//        StringBuilder jasonj = new StringBuilder();
//        jasonj.append(Arrays.toString(arr2));
//        jasonj.append("heavy bitch");
//        String s = jasonj.toString();
//        if (jasonj.equals(s))
//        {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//        System.out.println(s);
//        s.l
}

    }

