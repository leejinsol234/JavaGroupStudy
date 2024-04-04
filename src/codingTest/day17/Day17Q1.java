package codingTest.day17;

public class Day17Q1 {
    public String solution(String myString, String pat) {
        String answer = "";
        int idx = myString.lastIndexOf(pat);
        answer = myString.substring(0,idx)+pat;
        return answer;
    }
}
