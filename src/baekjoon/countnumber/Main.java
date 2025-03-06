package baekjoon.countnumber;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine()); //A 숫자
        int B = Integer.parseInt(br.readLine()); //B 숫자
        int C = Integer.parseInt(br.readLine()); //C 숫자

        int multi = A * B * C; //A,B,C를 모두 곱한 수
        int divideNum = multi; //맨 끝 자릿수부터 하나씩 자릿수를 지워갈 것이기 때문에 별도의 변수에 값을 저장
        int[] numbers = new int[10];// 0~9까지 숫자 배열 생성


        //ABC를 곱한 수의 자릿수 만큼 반복하며, 1의 자릿수부터 하나씩 체크
        for(int i = 0; i < String.valueOf(multi).length(); i++) { //곱한 수의 총 자릿수만큼 반복
            int modNum = divideNum % 10;//10으로 나누면 1의 자릿수가 도출됨.
            numbers[modNum]++; //도출된 수의 배열인덱스 값을 +1
            divideNum = divideNum / 10; //검사한 자릿수를 제외한 숫자 도출
        }

        for(int i = 0; i < numbers.length; i++) {
            bw.write(String.valueOf(numbers[i]));
            if(i != numbers.length - 1) {
                bw.newLine();
            }
            bw.flush();
        }
        br.close();
        bw.close();

    }
}
