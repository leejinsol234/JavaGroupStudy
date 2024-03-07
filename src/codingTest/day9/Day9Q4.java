package codingTest.day9;

import java.util.Arrays;

public class Day9Q4 {
    public String[] solution(String my_string) {
        int length = my_string.length();
        String[] answer = new String[length];

        for(int i=0; i<length; i++){
            answer[i] = my_string.substring(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
