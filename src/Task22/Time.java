package Task22;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Time {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar(2017, Calendar.JULY , 25, 10, 42, 12);

        DateFormat df = new SimpleDateFormat("dd MMMMMMMMMMM yyyy hh:mm:ss");
        System.out.println(df.format(calendar.getTime()));

        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(97975676756L);

        System.out.println(formater.format(date));

    }
}
