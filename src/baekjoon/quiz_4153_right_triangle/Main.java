package baekjoon.quiz_4153_right_triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // "0 0 0"이 입력될 때까지 무한 반복
        while(true) {
            String input = br.readLine();

            // 입력값이 "0 0 0" 이면 종료
            if("0 0 0".equals(input)) {
                break;
            }
            // 입력값을 공백 기준으로 분리하여 각 변의 값을 변수에 저장
            String[] triangle = input.split(" ");

            int temp = 0;
            int auset = Integer.parseInt(triangle[0]);
            int ausar = Integer.parseInt(triangle[1]);
            int heru = Integer.parseInt(triangle[2]);

            // 입력된 값을 오름차순으로 정렬
            if(auset > ausar) {
                temp = auset;
                auset = ausar;
                ausar = temp;
            }
            if(ausar > heru) {
                temp = ausar;
                ausar = heru;
                heru = temp;
            }

            // 피타고라스 정리(a 제곱 + b 제곱 = c 제곱)을 이용해 작은 두 수의 제곱의 합이 가장 큰 수의 제곱과 같은지 비교
            if(auset * auset + ausar * ausar == heru * heru) {
                System.out.println("right");
            }else {
                System.out.println("wrong");
            }
        }
        br.close();
    }
}