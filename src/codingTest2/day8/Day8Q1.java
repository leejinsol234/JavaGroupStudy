package codingTest2.day8;

import java.util.Arrays;

public class Day8Q1 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        answer = Arrays.copyOfRange(numbers, num1, num2+1);
        return answer;
    }
}
