package taeuk.calendar;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.reflect.generics.tree.VoidDescriptor;

import java.util.Scanner;

public class Prompt {

//    @return 0 ~ 6 (0 = sun ~ 6 = sa)


    public void runPrompt() {
        //숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();

        int month = 1;
        int year = 2021;

        while (true) {
            System.out.println("년도를 입력하세요.");
            System.out.println("> ");
            year = scanner.nextInt();
            if (year == -1) {
                break;
            }
            System.out.println("월을 입력하세요.");
            System.out.println("> ");
            month = scanner.nextInt();

            if(month > 12 || month < 1) {
                System.out.println("잘못된 입력입니다.");
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
