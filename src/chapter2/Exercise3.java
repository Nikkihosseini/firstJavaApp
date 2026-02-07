package chapter2;

public class Exercise3{
    public static void main(String[] args){
        long salary = 253000;
        double tax , netSalary;
        tax = salary * 10 / 100;
        netSalary = salary - tax;
        System.out.println("Your Salary is: " + salary);
        System.out.println("tax of Salary is: " + tax);
        System.out.println("Your Net Salary is: " + netSalary);
    }
}