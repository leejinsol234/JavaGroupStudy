package codingTest.day18;

public class Day18Q5 {
    public String solution(String rny_string) {
        String answer = "";
        answer = rny_string.replaceAll("m","rn");
        return answer;
    }
}
