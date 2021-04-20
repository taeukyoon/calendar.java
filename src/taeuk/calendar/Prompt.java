package taeuk.calendar;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Prompt {

    private final static String PROMPT="cal>";


    public void runPrompt() {
        //숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();

        int month = -1;
        int year = -1;

        while (true) {
            System.out.println("년도를 입력하세요.");
            System.out.println("YEAR> ");
            year = scanner.nextInt();
            System.out.println("월을 입력하세요.");
            System.out.println("MONTH> ");
            month = scanner.nextInt();
            System.out.println(PROMPT);
            if(month == -1) {
                break;
            }
            if(month > 12) {
                continue;
            }
            cal.printCalender(year, month);
        }
        System.out.println("KKKK~");
        scanner.close();

    }

    public static void main(String[] args) {
        //셀 실행
        Prompt p = new Prompt();
        p.runPrompt();

    }
}
