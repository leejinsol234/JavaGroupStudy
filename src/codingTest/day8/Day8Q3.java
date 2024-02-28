package codingTest.day8;

public class Day8Q3 {
    public String solution(String my_string, int[] index_list) {

        String answer = "";
        char[] charArr = my_string.toCharArray();

        for(int i : index_list){
            answer += charArr[i];
        }

        return answer;
    }
}
