package codingTest.day22;

public class Day22Q5 {
    public int solution(String my_string, String target) {
        int answer = 0;
        if(my_string.contains(target)){
            answer = 1;
        }
        return answer;
    }
}
