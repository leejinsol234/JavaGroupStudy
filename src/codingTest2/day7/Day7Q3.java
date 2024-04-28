package codingTest2.day7;

public class Day7Q3 {
    public int solution(int n, int k) {
        int answer = 0;
        answer = (n*12000) + k*2000-((n/10)*2000);
        return answer;
    }
}
