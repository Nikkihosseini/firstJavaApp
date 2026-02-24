package rectangleClass;


import java.util.Scanner;

public class Rectangle {
    Scanner scanner = new Scanner(System.in);
    int width;
    int length;
    int area;
    int perime;

    public void readSides() {
        System.out.print("Enter width & length: ");
        width = scanner.nextInt();
        length = scanner.nextInt();
    }

    public void calculat(){
        area = length * width;
        perime = 2 * (width + length);
    }

    public void display(){
        System.out.printf("Area = %d , Perime = %d", area , perime);
    }

}