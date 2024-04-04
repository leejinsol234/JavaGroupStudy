package codingTest.day18;

public class Day18Q4 {
    public int solution(String myString, String pat) {
        int answer = 0;

        String replaced = myString.replaceAll("A","X").replaceAll("B","A").replace("X","B");

        if(replaced.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}
