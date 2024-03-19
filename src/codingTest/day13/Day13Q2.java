package codingTest.day13;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Day13Q2 {
    public int[] solution(int[] num_list, int n) {

        int[] start = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] end = Arrays.copyOfRange(num_list, 0, n);

        int[] answer = IntStream.concat(IntStream.of(start),IntStream.of(end)).toArray();
        return answer;
    }
}
