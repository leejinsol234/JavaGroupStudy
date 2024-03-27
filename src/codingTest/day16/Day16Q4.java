package codingTest.day16;

public class Day16Q4 {
    public String solution(String myString) {
        String answer = "";
        myString = myString.toLowerCase();
        answer = myString.replaceAll("a","A");

        return answer;
    }
}
