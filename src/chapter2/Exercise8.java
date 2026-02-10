package chapter2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = 6;

        System.out.print("In main before calling the method: ");
        System.out.println("Number: " + number);

        printParameter(number);

        System.out.print("In main after calling the method: ");
        System.out.println("Number: " + number);

    }

    //******************************
    public static void printParameter(int num){
        System.out.print("In method before changing: ");
        System.out.println("Number: " + num);
        System.out.println("In method after changing: " + (num + 6));
    }
}
