package codingTest2.day13;

public class Day13Q3 {
    public String solution(String my_string) {
        String answer = "";

        for(int i=0; i<my_string.length(); i++){
            if(my_string.indexOf(my_string.charAt(i)) == i){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
