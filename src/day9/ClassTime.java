package day9;

import org.w3c.dom.ls.LSOutput;

import java.util.Calendar;

public class ClassTime {

    public static void main(String[] args) {
        //Write a Java
        // program to get the maximum value of the year, month, week,
        // date from the current date of a default calendar.
        Calendar calendar = Calendar.getInstance();
            int maxYear = calendar.getActualMaximum(Calendar.YEAR);
            int maxMonth = calendar.getMaximum(Calendar.MONTH);
            int maxWeek = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
            int maxDate = calendar.getActualMaximum(Calendar.DATE);
        System.out.println(maxYear);
        System.out.println(maxMonth);
        System.out.println(maxWeek);
        System.out.println(maxDate);
        System.out.println(calendar.getTime());



    }
}
