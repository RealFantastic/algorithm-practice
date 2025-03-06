package baekjoon.remain;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private static final int MOD_NUMBER = 42;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> nonDuplicateIntegers = new HashSet<>(); //중복된 값을 제외하기 위해 HashSet 사용

        for(int i = 0; i < 10; i++){
            int n = Integer.parseInt(br.readLine()); //콘솔로부터 숫자를 읽고,
            nonDuplicateIntegers.add(n % MOD_NUMBER);// 42로 나눈 수를 Set에 저장
        }
        br.close();

        bw.write(Integer.toString(nonDuplicateIntegers.size())); //중복된 나머지값은 제외되므로 서로 다른 나머지의 갯수가 출력됨
        bw.flush();
        bw.close();
    }
}
