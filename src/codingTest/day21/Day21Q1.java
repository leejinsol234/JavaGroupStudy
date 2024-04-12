package codingTest.day21;

import java.util.Arrays;

public class Day21Q1 {
    public int[] solution(int[] num_list) {

        Arrays.sort(num_list);
        int[] answer = Arrays.copyOfRange(num_list, 5, num_list.length);

        return answer;
    }
}
