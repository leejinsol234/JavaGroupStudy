package codingTest2.day12;

import java.util.ArrayList;
import java.util.List;

public class Day12Q4 {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for(int i=2; i<=n; i++){
            if(n%i == 0){
                while(n%i == 0){
                    n/= i;
                }
                list.add(i);
            }
        }

        int[] answer = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}