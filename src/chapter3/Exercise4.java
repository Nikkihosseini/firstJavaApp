package chapter3;


import java.util.Scanner;

public class Exercise4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num = scanner.nextInt();

        System.out.print("Number: " + num + " Factorial: " + factorial(num));
    }

    public static long factorial(int number){
        long fact = 1;
        for(int i = 2 ; i <= number ; i++){
            fact *= i;
        }
        return fact;
    }
}