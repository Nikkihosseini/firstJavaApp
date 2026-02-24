package wageClass;


public class Wage{
    private int baseSalary = 50_000;
    private int extraSalary = 5_000;
    private int extraHours;

    public void setExtraHours(int extraHours){
        if(extraHours < 0)
            throw  new IllegalArgumentException("Extra Hours cannot be 0 or less!");
        this.extraHours = extraHours;
    }

    public int getExtraHours(){
        return baseSalary + (extraSalary * extraHours);
    }
}