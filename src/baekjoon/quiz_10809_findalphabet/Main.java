package baekjoon.quiz_10809_findalphabet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /* Quiz. 10809 - 알파벳 찾기
    * 주어진 단어에서 각각 a~z까지의 알파벳이 처음 등장하는 위치가 몇 번 째인지 표시
    * 단, 없는 알파벳은 -1로 표기하여 공백으로 띄어쓰기하여 한 줄로 출력
    * - 조건 : 단어의 길이는 100을 넘지 않음, 알파벳은 소문자로만 구성됨
    * - ex) baekjoon -> 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int[] countArr = new int[26];
        Arrays.fill(countArr, -1); // 알파벳 개수만큼의 크기를 가진 배열 선언 및 모든 인덱스의 값을 -1로 초기화

        for(int i = 0; i < S.length(); i++) { //단어 길이만큼 반복 수행, i는 단어의 알파벳이 등장하는 위치를 나타냄
            char c = S.charAt(i);
            int index = c - 'a'; // 각 문자의 ASCII 값에서 'a'의 ASCII 값을 빼 인덱스를 구함
            if(countArr[index] == -1) { // 해당 인덱스가 값이 -1이면 즉, 이전에 등장한 적이 없으면 해당 인덱스 위치의 값을 변경
                countArr[index] = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < countArr.length; i++) {
            sb.append(countArr[i]);
            if(i != countArr.length - 1) { // 마지막 인덱스가 아니면 공백 추가, 마지막 인덱스라면 공백 추가 없음
                sb.append(" ");
            }
        }
        System.out.println(sb);

        br.close();
    }
}
