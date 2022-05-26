package com.company.gotcha;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calculator {

/*


        public static void main(String[] args) throws FileNotFoundException {
            Scanner scanner = new Scanner("input");


            int num1 = getInt(scanner);
            int num2 = getInt(scanner);
            char operation = getOperation();
            int result = calc (num1,num2,operation);
            System.out.println("result: "+ result);

        }
        public static int getInt(Scanner scanner) {
            System.out.println("Write the number: ");
            int num;
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                System.out.println("Number: "+ num);
            } else {
                System.out.println("Wrong number");
                scanner.next();
                num = getInt(scanner);

            } return num;
        }
        public static char getOperation() {
            System.out.println("Write the operation");
            char operation = 0;
            if (scanner.hasNext()) {
                operation = scanner.next().charAt(0);
            }else {
                System.out.println("Wrong operation");
                scanner.next();
                operation = getOperation();
            }
            return operation;

        }


        public static int calc(int num1, int num2, char operation) {
            int result;
            switch (operation) {
                case '+' :
                    result = num1 + num2;
                    break;
                case '-' :
                    result = num1 - num2;
                    break;
                case '*' :
                    result = num1 * num2;
                    break;
                case '/' :
                    result = num1 / num2;
                    break;
                default :
                    System.out.println("Operation can't be done");
                    result = calc (num1, num2, getOperation());
            }
            return result;
        }*/
}
