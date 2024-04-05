package codingTest.day19;

import java.util.ArrayList;

public class Day19Q2 {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int num;

        for(int i=0; i<arr.length; i++){
            num = arr[i];
            for(int j=0; j<num; j++){
                answer.add(num);
            }
        }
        return answer;
    }
}
