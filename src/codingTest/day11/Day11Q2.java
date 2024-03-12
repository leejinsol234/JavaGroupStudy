package codingTest.day11;

import java.util.ArrayList;
import java.util.List;

public class Day11Q2 {
    public int[] solution(int n, int k) {
        List<Integer> multiple = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(i%k==0) multiple.add(i);
        }

        int[] answer = new int[multiple.size()];
        for(int i=0; i<multiple.size(); i++){
            answer[i] += multiple.get(i);
        }
        return answer;
    }
}
