package chapter4;


public class Exercise1 {
    public static void main(String[] args){

        int baseSalary = 50_000;
        int extraSalary = 2_000;
        int hourlyRate = 10;

        int wage = calculateWage(baseSalary ,extraSalary, hourlyRate);

        System.out.println(wage);

    }

    public static int calculateWage(
        int baseSalary,
        int extraSalary,
        int hourlyRate){

        return baseSalary + (extraSalary * hourlyRate);

    }
}