package codingTest2.day9;

public class Day9Q1 {
    public int solution(int hp) {
        int answer = (hp/5) + ((hp%5)/3) + ((hp%5)%3);

        return answer;
    }
}
