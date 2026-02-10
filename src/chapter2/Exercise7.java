package chapter2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int a, b, c;
        double x, y, z;


        System.out.print("Enter three integers: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Max integers: " + findMax(a , b , c));


        System.out.print("Enter three decimal numbers: ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Max decimals: " + findMax(x , y , z));
    }

    //******************************
    public static int findMax(int a, int b, int c){
        int max = a > b ? a : b;
        max = max > c ? max : c;
        return max;
    }

    //******************************
    public static double findMax(double a, double b, double c){
        double max = a > b ? a : b;
        max = max > c ? max : c;
        return max;
    }
}
