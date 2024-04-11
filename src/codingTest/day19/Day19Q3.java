package codingTest.day19;

import java.util.ArrayList;

public class Day19Q3 {
    public ArrayList<Integer> solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<flag.length; i++){
            if(flag[i]){
                for(int j=0; j<arr[i]*2; j++){
                    answer.add(arr[i]);
                }
            } else if(!flag[i]){
                for(int j=0; j<arr[i]; j++){
                    answer.remove(answer.size()-1);
                }
            }
        }
        return answer;
    }
}
