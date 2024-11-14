package beginner;


public class UpperCaseAndLowerCase {
    /*
    *
    * 문제 : 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
    *
    * 제한사항
    * - 1 ≤ my_string의 길이 ≤ 1,000
    * my_string은 영어 대문자와 소문자로만 구성되어 있습니다.
    * */

    public String solution(String my_string){
        String answer = "";

        String[] myStringArr = my_string.split("");

        for(String s : myStringArr){
            if(s.toLowerCase().equals(s)){
                answer = answer + s.toUpperCase();
            }else{
                answer = answer + s.toLowerCase();
            }
        }

        return answer;
    }
}
