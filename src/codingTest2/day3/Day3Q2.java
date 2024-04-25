package codingTest2.day3;

import java.util.Arrays;

public class Day3Q2 {
    public int solution(int[] array) {
        int answer = 0;

        Arrays.sort(array);

        answer = array[array.length/2];
        return answer;
    }
}
