package taeuk.calendar;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        //입력 : 두 수의 값을 입력합니다.
        System.out.println("두 수를 입력하시오.");
        int i,j;
        Scanner inputValue = new Scanner(System.in);
        String s1,s2;
        s1 = inputValue.next();
        s2 = inputValue.next();
        i = Integer.parseInt(s1);
        j = Integer.parseInt(s2);

        //출력: 두 수의 합을 출력합니다.
        System.out.printf("%d와 %d의 합은 %d입니다.",i,j, i + j);
        inputValue.close();
    }
}
