package chapter4;


public class Exercise1 {
    public static void main(String[] args){

        int baseSalary = 50_000;
        int extraSalary = 2_000;
        int  extraHours = 10;

        int wage = calculateWage(baseSalary ,extraSalary, extraHours);

        System.out.println(wage);

    }

    public static int calculateWage(
        int baseSalary,
        int extraSalary,
        int extraHours){

        return baseSalary + (extraSalary * extraHours);

    }
}