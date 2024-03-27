package codingTest.day16;

public class Day16Q5 {
    public String solution(String my_string, String alp) {
        String answer = "";
        if(my_string.contains(alp)){
            answer = my_string.replaceAll(alp, alp.toUpperCase());
        } else {
            answer = my_string;
        }
        return answer;
    }
}
