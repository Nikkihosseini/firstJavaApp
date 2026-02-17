package chapter3;


import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){

        for(int i = 41 ; i <= 120 ; i++){
            System.out.print(i + " = " + (char)i + "\t\t");

            if(i % 5 == 0 ){
                System.out.println();
            }
        }

    }
}