package dateClass;


public class DateTest4{
    private int year;
    private int month;
    private int day;

    public DateTest4(int year,int month){
        this(year,month,13);
    }

    public DateTest4(int year,int month,int day){
        setDate(year,month,day);
    }

    private void setDate(int year, int month, int day){
        if(year < 1 || year > 3000 ||
                month < 1 || month > 12 ||
                day < 1){
            throw new IllegalArgumentException("Invalid time value");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getDate(){
        return year + "/" + month + "/" + day;
    }

}