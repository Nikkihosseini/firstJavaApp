package dateClass;


public class Exercise6 {
    public static void main(String[] args){
        var date1 = new DateTest4(2005,5);
        var date2 = new DateTest4(2002, 3, 13);

        System.out.println("Date 1: " + date1.getDate());
        System.out.println("Date 2: " + date2.getDate());

    }
}