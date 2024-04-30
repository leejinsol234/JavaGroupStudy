package codingTest2.day9;

public class Day9Q3 {
    public String solution(String rsp) {
        String answer = "";

        char scissors = '2';
        char rock = '0';
        char paper = '5';

        for(int i=0; i<rsp.length(); i++){
            if(rsp.charAt(i) == scissors){
                answer += rock;
            } else if(rsp.charAt(i) == rock){
                answer += paper;
            } else if(rsp.charAt(i) == paper){
                answer += scissors;
            }
        }
        return answer;
    }
}
