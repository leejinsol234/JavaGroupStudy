package codingTest2.day6;

public class Day6Q3 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                answer[0]++;
            } else {
                answer[1]++;
            }
        }
        return answer;
    }
}
