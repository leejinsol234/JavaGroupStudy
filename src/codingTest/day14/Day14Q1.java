package codingTest.day14;

public class Day14Q1 {
    public int solution(int[] num_list) {
        int answer = 0;
        int oddSum = 0;
        int evenSum = 0;

        for(int i=0; i<num_list.length; i++){
            if(i%2 == 0){
                evenSum += num_list[i];
            } else {
                oddSum += num_list[i];
            }
        }

        if(evenSum > oddSum){
            return evenSum;
        } else if(evenSum < oddSum){
            return oddSum;
        } else {
            answer = evenSum;
        }

        return answer;
    }
}
