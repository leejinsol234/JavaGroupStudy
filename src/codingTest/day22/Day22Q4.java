package codingTest.day22;

import java.util.ArrayList;
import java.util.List;

public class Day22Q4 {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();

        for(int num : arr){
            answer.add(num);
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]){
                    answer.remove(Integer.valueOf(arr[i]));
                }
            }
        }
        return answer;
    }
}
