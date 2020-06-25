
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class BadmintonCourt {
    private int minute;
    private Calendar time;
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    public BadmintonCourt(){};
    public BadmintonCourt(int minute){
        this.minute=minute;
    }
    public int getMinute(){
        return minute;
    }

    public static void addMinute(int minute){
        Date currentDate = new Date();
        System.out.println("Current time is "+dateFormat.format(currentDate));

        // convert date to calendar
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);

        c.add(Calendar.MINUTE, minute);

        // convert calendar to date
        Date currentDatePlusOne = c.getTime();

        System.out.println("Booking successfully. The end time now is "+dateFormat.format(currentDatePlusOne));
    }


}
