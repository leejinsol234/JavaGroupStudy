package codingTest.day20;

import java.util.Arrays;

public class Day20Q3 {
    public int solution(String[] strArr) {
        int[] count = new int[100000];

        for(int i=0; i<strArr.length; i++){
            count[strArr[i].length()]++;
        }

        return Arrays.stream(count).max().getAsInt();
    }
}
