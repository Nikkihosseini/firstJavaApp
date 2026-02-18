package chapter3;


import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean done = true;
        int lampWatt , price;

        while(done){

            System.out.print("Enter the Lamp Watt: ");
            lampWatt = scanner.nextInt();

            switch (lampWatt){
                case 40:
                    price = 1000;
                    System.out.println("watt = " +  lampWatt + "\t" + "price = " + price);
                    break;
                case 60:
                    price = 1200;
                    System.out.println("watt = " +  lampWatt + "\t" + "price = " + price);
                    break;
                case 75:
                    price = 1500;
                    System.out.println("watt = " +  lampWatt + "\t" + "price = " + price);
                    break;
                case 100:
                case 150:
                    price = 1800;
                    System.out.println("watt = " +  lampWatt + "\t" + "price = " + price);
                    break;
                case 200:
                    price = 2500;
                    System.out.println("watt = " +  lampWatt + "\t" + "price = " + price);
                    break;
                default:
                    System.out.println("The value of watt is illegal!");
                    done = false;

            }

        }


    }
}