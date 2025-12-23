package baekjoon.quiz_10250_acmhotel;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine()); //테스트 개수
        for(int i = 0; i < t; i++) {
            String HWN = br.readLine(); // 호텔 높이, 층당 방 개수, n번째 손님인지 입력
            String[] numerics = HWN.split(" ");

            int H = Integer.parseInt(numerics[0]);
            int W = Integer.parseInt(numerics[1]);
            int N = Integer.parseInt(numerics[2]);
            int X, Y;

            if(N % H == 0) {
                Y = H * 100; // n 번째 손님과 층수가 나누어 떨어지면 최대 층수인 H 층 배정
                X = N / H; // n번 쨰 손님이 층수가 나누어 떨어지면 YYX1호실 배정
            }else {
                Y = (N % H) * 100; // YXX or YYXX여야 하므로 층수 * 100
                X = N / H + 1; // 몫이 있으면 해당 호실은 전층이 꽉찬 것이므로 다름 호실로 이동해야함.
            }
            System.out.println(X + Y);
        }
        br.close();
    }
}
