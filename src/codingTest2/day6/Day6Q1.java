package codingTest2.day6;

public class Day6Q1 {
    public String solution(String my_string) {
        String answer = "";

        for(int i=my_string.length()-1; i>=0; i--){
            answer += my_string.substring(i,i+1);
        }
        return answer;
    }
}
