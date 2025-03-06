package baekjoon.oxquiz;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //콘솔 입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //콘솔 출력
        int testCount = Integer.parseInt(br.readLine()); //테스트케이스의 개수
        for(int i = 0; i < testCount; i++) {
            int score = 0;
            String[] oxArray = br.readLine().split("");
            int number = 0;
            for(String ox : oxArray) {
                if("O".equals(ox)){
                    number++;
                }else{
                    number = 0; //연속이 끊기기 때문에 다시 0으로 초기화
                }
                score += number; //연속된만큼 늘어난 점수를 score에 반영
            }
            bw.write(score);
            bw.write("\n");
            bw.flush();
        }
        br.close();
        bw.close();


    }
}
