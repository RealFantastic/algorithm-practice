package programmers.beginner;

import java.util.Arrays;
import java.util.List;

public class DeleteVowel {
    public static void main(String[] args) {
        String helloWorld = "Hello World";
        solution(helloWorld);

    }


    public static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        String[] splits = my_string.split("");
        String[] vowels = {"a","e","i","o","u"};

        for(int i = 0; i < splits.length; i++){
            String split = splits[i];
            for (String vowel : vowels) {
                if (split.equals(vowel)) {
                    splits[i] = "";
                    break;
                }
            }
        }

        for (String split : splits) {
            sb.append(split);
        }
        answer = sb.toString();

        return answer;
    }
    

    
}
