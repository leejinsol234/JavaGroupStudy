package codingTest2.day6;

public class Day6Q4 {
    public String solution(String my_string, int n) {
        String answer = "";

        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<n; j++){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
