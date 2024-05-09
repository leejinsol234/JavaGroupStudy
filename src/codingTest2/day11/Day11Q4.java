package codingTest2.day11;

public class Day11Q4 {
    public int solution(int n) {
        int answer = 0;
        int count = 1;

        for(int i=1; i<=10; i++){
            count *= i;

            if(count == n){
                answer = i;
                break;
            } else if(count > n){
                answer = (i-1);
                break;
            }
        }

        return answer;
    }
}
