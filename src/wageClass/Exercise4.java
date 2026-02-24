package wageClass;


import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        var wage = new Wage(50_000, 5_000);

        int extraHours;
        System.out.print("enter extra hours you worked: ");
        extraHours = scanner.nextInt();

        wage.setExtraHours(extraHours);
        System.out.println("Total wage is: " + wage.getExtraHours());
    }
}