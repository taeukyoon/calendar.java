package taeuk.calendar;

import java.util.Scanner;

public class Prompt {

    private final static String PROMPT="cal>";


    public void runPrompt() {
        //숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();

        int month = 1;

        while (true) {
            System.out.println("월을 입력하세요.");
            System.out.println(PROMPT);
            month = scanner.nextInt();
            if(month == -1) {
                break;
            }
            if(month > 12) {
                continue;
            }
            cal.printCalender(2021, month);
        }
        System.out.println("Bye~");
        scanner.close();

    }

    public static void main(String[] args) {
        //셀 실행
        Prompt p = new Prompt();
        p.runPrompt();

    }
}
