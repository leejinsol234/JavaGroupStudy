package codingTest.day7;

import java.util.ArrayList;
import java.util.List;

public class Day7Q2 {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        int count = 0;

        for(int i = l; i<=r; i++){
            String str= i + "";
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == 48 || str.charAt(j) == 53){
                    count++;
                }
            }
            if(count == str.length()){
                list.add(i);
            }
            count = 0;
        }

        int[] answer = list.stream().mapToInt(i->i).toArray();
        int[] empty = {-1};
        if(answer.length == 0) return empty;
        return answer;
    }
}
