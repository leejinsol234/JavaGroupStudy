package codingTest.day7;

public class Day7Q3 {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num-start_num+1];
        for(int i=0; i<answer.length; i++){
            answer[i] = start_num++;
        }
        return answer;
    }
}