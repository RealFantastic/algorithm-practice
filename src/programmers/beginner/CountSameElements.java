package programmers.beginner;

import java.util.Arrays;

public class CountSameElements {
    public static void main(String[] args) {
        String[] s1 = {"n", "omg"};
        String[] s2 = {"m", "dot"};
        int solution = solution(s1, s2);
        System.out.println("solution = " + solution);
    }

    public static int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if(s1[i].equals(s2[j])) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
