package codingTest2.day4;

public class Day4Q2 {
    public int solution(int n) {

        int answer = 1;

        while((6*answer)%n != 0){
            answer++;
        }
        return answer;
    }
}
