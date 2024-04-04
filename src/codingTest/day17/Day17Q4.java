package codingTest.day17;

public class Day17Q4 {
    public String[] solution(String my_string) {

        String[] words = my_string.split(" ");
        String[] answer = new String[words.length];
        for(int i=0; i<words.length; i++){
            answer[i] = words[i];
        }
        return answer;
    }
}
