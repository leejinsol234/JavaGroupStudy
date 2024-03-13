package codingTest.day12;

import java.util.ArrayList;
import java.util.List;

public class Day12Q4 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int start = -1;
        int end = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2){
                start = i;
                break;
            }
        }

        if(start != -1){
            for(int i=start; i<arr.length; i++){
                if(arr[i] == 2){
                    end = i;
                }
            }
        }

        if(start == -1){
            list.add(-1);
        } else if(start == end){
            list.add(2);
        } else {
            for(int i=start; i<=end; i++){
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
