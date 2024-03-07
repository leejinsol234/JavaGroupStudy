package codingTest.day9;

public class Day9Q3 {
    public String solution(String my_string, int n) {
        String answer = "";

        answer = my_string.substring(my_string.length()-n, my_string.length());
        return answer;
    }
}
