package chapter3;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int num;
        double average;

        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Enter Number " + (i + 1) + ":");
            num = scanner.nextInt();
            sum += num;
        }

        average = sum / 5 ;
        System.out.println("Average: " + average);

    }
}