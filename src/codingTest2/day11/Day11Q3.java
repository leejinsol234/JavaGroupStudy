package codingTest2.day11;

import java.util.Arrays;

public class Day11Q3 {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        answer = numbers[numbers.length-1]*numbers[numbers.length-2];
        return answer;
    }
}
