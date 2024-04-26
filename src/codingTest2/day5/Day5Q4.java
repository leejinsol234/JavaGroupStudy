package codingTest2.day5;

public class Day5Q4 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for(int i=0; i<num_list.length; i++){
            answer[num_list.length-i-1] = num_list[i];
        }
        return answer;
    }
}
