package codingTest2.day13;

import java.util.Arrays;

public class Day13Q4 {
    public int solution(int[] sides) {
        int answer = 1;
        Arrays.sort(sides);
        if(sides[2]>=sides[0]+sides[1]){
            answer = 2;
        }
        return answer;
    }
}
