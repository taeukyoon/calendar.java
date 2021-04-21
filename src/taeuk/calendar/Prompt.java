package taeuk.calendar;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.reflect.generics.tree.VoidDescriptor;

import java.util.Scanner;

public class Prompt {

//    @return 0 ~ 6 (0 = sun ~ 6 = sa)

    public int parseDay(String week) {
        if (week.equals("SU")) return 0;
        else if (week.equals("MO")) return 1;
        else if (week.equals("TU")) return 2;
        else if (week.equals("WE")) return 3;
        else if (week.equals("TH")) return 4;
        else if (week.equals("FR")) return 5;
        else if (week.equals("SA")) return 6;
        else
            return 0;
    }

    public void runPrompt() {
        //숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();

        int month = 1;
        int year = 2021;
        int weekday = 0;
        while (true) {
            System.out.println("년도를 입력하세요.");
            System.out.println("YEAR> ");
            year = scanner.nextInt();
            if (year == -1) {
                break;
            }
            System.out.println("월을 입력하세요.");
            System.out.println("MONTH> ");
            month = scanner.nextInt();
            System.out.println("첫번째 요일을 입력하세요. (SU, TU, MO, WE, TH, FR, SA)");
            System.out.println("WEEKDAY> ");
            String str_weekday = scanner.next();
            weekday = parseDay(str_weekday);

            if(month > 12 || month < 1) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            cal.printCalender(year, month, weekday);
        }
        System.out.println("KKKK~");
        scanner.close();

    }

    public static void main(String[] args) {
        //셀 실행
        Prompt p = new Prompt();
        p.runPrompt();
        //test  commit
    }
}
