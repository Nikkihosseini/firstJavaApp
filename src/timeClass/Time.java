package timeClass;


public class Time {

    private int hour;
    private int minute;
    private int second;


    public Time(int hour, int minute, int second){
        setTime(hour, minute,second);
    }


    private void setTime(int hour, int minute, int second){
        if(hour < 0 || hour > 23 ||
            minute < 0 || minute > 69 ||
            second < 0 || second > 69){
            throw new IllegalArgumentException("Invalid time value");
        };
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String getTime(){
        return hour + ":" + minute + ":" + second;
    }

}