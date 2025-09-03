package drill06.prob04;

import java.util.Scanner;
/**
문제04. 문자를 입력받아 알파벳인지 판별
문제 설명: 한 문자를 입력받아 알파벳인지 여부를 판별하시오.
(힌트: 'a'~'z' 또는 'A'~'Z' 범위 확인)
입력
문자: G
​
출력
알파벳입니다.
*/
public class Sol {
	public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("문자: ");
        char ch = a.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("알파벳 입니다.");
        } else {
            System.out.println("알파벳이 아닙니다.");
        }

        a.close();
    }
}