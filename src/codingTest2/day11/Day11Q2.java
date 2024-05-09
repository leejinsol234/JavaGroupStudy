package codingTest2.day11;

public class Day11Q2 {
    public int solution(int n) {
        int answer = 0;
        for(int i=n; i>=4; i--){
            int count = 0;
            for(int j=1; j<=i; j++){
                count += (i%j == 0) ? 1 : 0;
            }
            answer += (count >= 3) ? 1 : 0;
        }
        return answer;
    }
}
