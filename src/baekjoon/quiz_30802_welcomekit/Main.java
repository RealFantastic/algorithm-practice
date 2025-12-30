package baekjoon.quiz_30802_welcomekit;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 참가자 수 N
        String[] sizeArr = br.readLine().split(" "); // S ~ XXXL까지의 신청 인원수 배열
        String[] TP = br.readLine().split(" "); // 셔츠 묶음과 펜 묶음 수 배열
        int T = Integer.parseInt(TP[0]); // 셔츠 묶음 수 T
        int P = Integer.parseInt(TP[1]); // 펜 묶음 수 P

        int count = 0; // 티셔츠 주문에 필요한 총 묶음 수를 저장하기 위한 count
        for(String size : sizeArr) {
            int sizeNum = Integer.parseInt(size);
            if(sizeNum == 0) {
                continue;
            }
            // 셔츠 묶음수에 비해 신청 인원수가 작거나 같으면 1묶음 주문
            if(sizeNum <= T) {
                count++;
            }else {
                if(sizeNum % T == 0){
                    // 신청 인원이 셔츠 묶음수의 배수이면 두 수를 나눈 몫이 신청 묶음이 된다.
                    count += sizeNum / T;
                }else{
                    // 셔츠 묶음수보다 신청 인원이 많고 배수가 아니면, 신청 인원보다 크거나 같으면서 가장 작은 수를 만드는 수를 계산하여 count에 더함
                    int k = sizeNum / T + 1;
                    count += k;
                }
            }
        }
        System.out.println(count);
        System.out.printf("%d %d \n", N / P, N % P);

        br.close();
    }
}
