package wageClass;


public class Wage{
    private int baseSalary;
    private int extraSalary;
    private int extraHours;

    public Wage(int baseSalary, int extraSalary){
        setBaseSalary(baseSalary);
        setExtraSalary(extraSalary);
    }

    private void setBaseSalary(int baseSalary){
        if(extraHours < 0)
            throw  new IllegalArgumentException("Base Salary cannot be 0 or less!");
        this.baseSalary = baseSalary;
    }

    private void setExtraSalary(int extraSalary){
        if(extraHours < 0)
            throw  new IllegalArgumentException("Extra Salary cannot be 0 or less!");
        this.extraSalary = extraSalary;
    }

    public void setExtraHours(int extraHours){
        if(extraHours < 0)
            throw  new IllegalArgumentException("Extra Hours cannot be 0 or less!");
        this.extraHours = extraHours;
    }

    public int getExtraHours(){
        return baseSalary + (extraSalary * extraHours);
    }
}