package codingTest2.day15;

import java.util.Arrays;

public class Day15Q4 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int cnt = 0;

        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            cnt = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    cnt++;
                }
            }
            if(cnt==1){
                answer += arr[i];
            }
        }
        return answer;
    }
}
