package codingTest2.day8;

public class Day8Q1 {
    public int solution(int hp) {
        int answer = (hp/5) + ((hp%5)/3) + ((hp%5)%3);

        return answer;
    }
}
