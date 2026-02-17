package chapter3;


import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num , count1 = 0, count2 = 0;

        while(true){
            System.out.print("Enter a Number: ");
            num = scanner.nextInt();

            if(num == 0){
                break;
            } else if (num % 2 == 0) {
                count1++;
            } else {
                count2++;
            }
        }

        System.out.print("Even: " + count1 + "\t\t" + "Odd: " + count2 );



    }
}