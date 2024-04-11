package codingTest.day20;

public class Day20Q1 {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int tmp = 1;

        while(tmp < len){
            tmp *= 2;
        }

        int[] answer = new int[tmp];
        for(int i=0; i<len; i++){
            answer[i] = arr[i];
        }

        return answer;
    }
}
