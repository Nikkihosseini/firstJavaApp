package chapter2;


import java.util.Scanner;

public class Exercise6{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String firstName , lastName , line;
        int age;
        double weight;
        System.out.println("Enter firstName , lastName , age , weight: ");
        line = scanner.nextLine();
        System.out.println("Line: " + line);
        System.out.println("Enter firstName , lastName , age , weight: ");
        firstName = scanner.next();
        lastName = scanner.next();
        age = scanner.nextInt();
        weight = scanner.nextDouble();
        System.out.println("Name: " + firstName + '\t' +  lastName);
        System.out.println("age:: " + age);
        System.out.println("weight: " + weight);
    }
}