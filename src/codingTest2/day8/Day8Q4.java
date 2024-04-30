package codingTest2.day8;

public class Day8Q4 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0) answer++;
        }
        return answer;
    }
}
