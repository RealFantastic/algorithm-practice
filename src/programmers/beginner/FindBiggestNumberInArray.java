package programmers.beginner;

public class FindBiggestNumberInArray {
    /*
     * 문제 : 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
     * LEVEL : 0
     *
     * 제한사항
     * - 1 ≤ array의 길이 ≤ 100
     * - 0 ≤ array 원소 ≤ 1,000
     * - array에 중복된 숫자는 없습니다.
     *
     * */
    public static void main(String[] args) {
        int[] testCase = {9, 10, 11, 8};
        int[] solution = solution(testCase);
    }

    public static int[] solution(int[] array){
        int[] answer = {};
        int index = 0;
        int biggest = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > biggest){
                biggest = array[i];
                index = i;
            }
        }

        return new int[]{biggest, index};
    }
}
