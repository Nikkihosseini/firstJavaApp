package chapter3;


import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int houseWorked , rate;
        System.out.print("Please Enter houseWorked and rate: ");
        houseWorked = scanner.nextInt();
        rate = scanner.nextInt();

        calculate(houseWorked ,rate);
    }

    public static void calculate(int houseWorked, int rate){
        long regularPay;
        double overTimePay = 0;

        if(houseWorked > 40){
            regularPay = 40 * rate;
            overTimePay = (houseWorked - 40 ) * 1.5 * rate;
        } else{
            regularPay = houseWorked * rate;
        }
        System.out.println("Regular Pay is: " + regularPay);
        System.out.println("Over Time Pay is: " + overTimePay);
        System.out.println("Total Pay is: " + (regularPay + overTimePay));
    }
}