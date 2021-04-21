package taeuk.calendar;
import java.util.Scanner;

public class Calendar {
    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        if(year % 4 == 0 && (year % 100 !=0 || year % 400 == 0))
            return true;
        else
            return false;
    }
    public int getmaxDaysOfMonth(int year, int month) {
        if(isLeapYear(year)) {
            return  LEAP_MAX_DAYS[month - 1];
        }else {
            return MAX_DAYS[month - 1];
        }
    }

    public void printCalender(int year, int month, int weekday) {
        System.out.printf("   <<%3d %2d>>\n", year,month);
        System.out.println("  SU MO TU WE TH FI SA");
        System.out.println("  --------------------");

        int maxDay = getmaxDaysOfMonth(year, month);
        int count = 7 - weekday;
        int delim = (count < 7) ? count : 0;

        //print blank space
        for(int i = 0;  i <weekday; i++) {
            System.out.print("   ");
        }

        //print first line
        for(int i = 1; i <= count; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();

        //print second line to last

        count++;
        for (int i = count; i<=maxDay; i++) {
            System.out.printf("%3d", i);
            if(i % 7 == delim ) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }
}



