package codingTest2.day17;

import java.util.ArrayList;
import java.util.List;

public class Day17Q2 {
    public List<Integer> solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();

        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n == 0){
                answer.add(numlist[i]);
            }
        }
        return answer;
    }
}
