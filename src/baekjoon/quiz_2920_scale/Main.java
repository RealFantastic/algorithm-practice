package baekjoon.quiz_2920_scale;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        * Quiz. 2920 - 음계
        *
        * 다장조 음계를 숫자로 (c ~ C -> 1 ~ 8) 표현했을 때 주어진 수의 배열에서
        * 1부터 8까지 차례로 입력되면 ascending, 8부터 1까지 차례대로 입력하면 descending, 둘 다 아니면 mixed 출력
        *
        * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String scale = br.readLine();

        // 순차 증가 혹은 순차 감소 외에 전부 mixed 이므로 문자열 비교로도 간단하게 처리 가능함
        if(scale.equals("1 2 3 4 5 6 7 8")) {
            System.out.println("ascending");
        } else if(scale.equals("8 7 6 5 4 3 2 1")) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

        br.close();
    }
}
