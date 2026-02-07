package chapter2;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x, y, area, perime;
        System.out.println("Enter length and width: ");
        x = scanner.nextByte();
        y = scanner.nextByte();
        area = x * y;
        perime = (x + y) * 2;
        System.out.printf("Perime: %d , Area: %d", perime , area);

    }
}