package taeuk.calendar;
import java.util.Scanner;

public class Calendar {
    private static final int[] MAX_DAYS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        if(year % 4 == 0 && (year % 100 !=0 || year % 400 == 0))
            return true;
        else
            return false;
    }
    public int getmaxDaysOfMonth(int year, int month) {
        if(isLeapYear(year)) {
            return  LEAP_MAX_DAYS[month];
        }else {
            return MAX_DAYS[month];
        }
    }

    public void printCalender(int year, int month) {
        System.out.printf("%d년 %d월\n", year,month);
        System.out.println("  일 월 화 수 목 금 토");
        System.out.println("  --------------------");

        //get weekday automatically
        int weekday = getWeekDay(year, month, 1);

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

private int getWeekDay (int year, int month, int day) {
    int syear = 1980;
    final int STAMDARD_WEEKDAY = 1;

    int count = 0;

    for (int i =syear; i < year; i++) {
        int delta = isLeapYear(i) ? 366 : 365;
        count +=delta;
    }

//    System.out.println(count);
    for (int i = 1; i < month; i++) {
        int delta = getmaxDaysOfMonth(year, i);
        count += delta;
    }
    count += day;

    int weekday = (count + STAMDARD_WEEKDAY) % 7;
    return weekday;
  }
}


