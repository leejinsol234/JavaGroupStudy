package codingTest2.day7;

public class Day7Q4 {
    public int solution(int n) {
        int answer = 0;


        for(int i=1; i<=n; i++){
            if(i%2==0){
                answer += i;
            }
        }
        return answer;
    }
}
