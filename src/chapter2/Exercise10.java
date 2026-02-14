package chapter2;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = "";

        while(!input.equals("nikki")){
            System.out.println("Enter Nikki: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

    }
}
