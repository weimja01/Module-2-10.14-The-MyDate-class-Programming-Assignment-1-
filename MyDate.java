import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(){
        GregorianCalendar calendar = new GregorianCalendar();
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public MyDate(long elapsedTime){
        setDate(elapsedTime);
    }

    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;

    }

    public int getYear(){
        return year;

    }
    
    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }
    public void setDate(long elapsedTime){
    GregorianCalendar calendar = new GregorianCalendar();
    calendar.setTimeInMillis(elapsedTime);
    this.year = calendar.get(GregorianCalendar.YEAR);
    this.month = calendar.get(GregorianCalendar.MONTH);
    this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
}

 public static void main(String[] args) {

        MyDate date1 = new MyDate();
        System.out.println("Date1 (current date):");
        System.out.println("Year: " + date1.getYear());
        System.out.println("Month: " + date1.getMonth());
        System.out.println("Day: " + date1.getDay());
        System.out.println();

}
}

