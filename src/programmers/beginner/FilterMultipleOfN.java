package programmers.beginner;

import java.util.ArrayList;
import java.util.List;

public class FilterMultipleOfN {
    /*
    * 문제 : 정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
    * LEVEL : 0
    *
    * 제한사항
    * - 1 ≤ n ≤ 10,000
    * - 1 ≤ numlist의 크기 ≤ 100
    * - 1 ≤ numlist의 원소 ≤ 100,000
    * */
    public static void main(String[] args) {
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        int[] solution = solution(n, numlist);
    }

    public static int[] solution(int n, int[] numlist) {
        int[] answer = {};
        //n의 배수는 n으로 나누면 나머지가 0인 수
        int size = 0; //나머지가 0인 숫자의 갯수 파악(새로 담을 배열의 길이)
        for (int num : numlist) {
            if (num % n == 0) {
                size++;
            }
        }
        answer = new int[size]; //나머지가 0인 수의 개수만큼의 사이즈로 초기화
        int index = 0;
        for (int j : numlist) {
            if (j % n == 0) {
                answer[index] = j; //나머지가 0인 수는 순서대로 추가
                index++; //추가될 때마다 index를 1씩 증가
            }
        }


        return answer;
    }
}
