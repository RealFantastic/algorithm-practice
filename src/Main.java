import beginner.UpperCaseAndLowerCase;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //드래그
//        Solution solve = new Solution();
//        String[] wallpaper = new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."};
//        int[] answer = solve.solution(wallpaper);
//        for(int a : answer){
//            System.out.println(a);
//        }

        //대문자와 소문자
        UpperCaseAndLowerCase ul = new UpperCaseAndLowerCase();
        String str = ul.solution("cccCCC");
        System.out.println(str);
    }

    //드래그
    static class Solution{
        public int[] solution(String[] wallpaper){
            int[] answer = {};
            //lux, luy 는 최소값이여야함.
            //드래그 시작점 (lux, luy)와 끝점 (rdx, rdy)는 lux < rdx, luy < rdy를 만족해야 합니다. => 좌->우로 드래그한다.
            Integer lux = null;
            Integer luy = null;
            Integer rdx = null;
            Integer rdy = null;

            //y반복
            for(int i = 0; i < wallpaper.length; i++){
                char[] icons = wallpaper[i].toCharArray();
                //x반복
                for(int j = 0; j <icons.length; j++) {
                    char icon = icons[j];
                    if (icon == '#') {
                        if (luy == null) {
                            luy = j;
                        } else if (luy > j) {
                            luy = j;
                        }
                        if (rdy == null) {
                            rdy = j;
                        } else if (rdy <= j) {
                            rdy = j+1;
                        }
                        if (lux == null) {
                            lux = i;
                        } else if (lux > i) {
                            lux = i;
                        }
                        if (rdx == null) {
                            rdx = i;
                        } else if (rdx <= i) {
                            rdx = i+1;
                        }
                    }
                }
            }
            answer = new int[]{lux,luy,rdx,rdy};
            return answer;
        }
    }


}