package codingTest2.day7;

public class Day7Q1 {
    public String solution(String my_string, String letter) {
        String answer = "";

        answer = my_string.replaceAll(letter,"");
        return answer;
    }
}
