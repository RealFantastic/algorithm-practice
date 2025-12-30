package programmers.beginner;

public class FlexibleWorkingHours {
    public static void main(String[] args) {
        solution(new int[]{730, 855, 700, 720}
                , new int[][]{{710, 700, 650, 735, 700, 931, 912},
                            {908, 901, 805, 815, 800, 831, 835},
                            {705, 701, 702, 705, 710, 710, 711},
                            {707, 731, 859, 913, 934, 931, 905}}, 1);
    }
    public static int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int count = 0;

        for(int i = 0; i < timelogs.length; i++) {
            int schedule = schedules[i];
            boolean canGift = false;
            int length = timelogs[i].length;
            for(int j = 0; j < timelogs[i].length; j++) {
                if(j == length - startday || j == length - startday - 1) {
                    continue;
                }
                int maxSchedule ;
                if(timelogs[i][j] >= schedule || timelogs[i][j] <= schedule + 10) {
                    canGift = true;
                }else {
                    canGift = false;
                }
            }
            if(canGift) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
