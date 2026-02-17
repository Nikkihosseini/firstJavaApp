package chapter3;


import java.util.Scanner;

public class Exercise5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num , digit;
        System.out.print("Enter a number : ");
        num = scanner.nextInt();

        do{

            digit = num % 10;
            System.out.print(digit);
            num /= 10;

        }while (num != 0);
    }
}