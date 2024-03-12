package codingTest.day11;

public class Day11Q1 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) > 64 && my_string.charAt(i) < 91) { //대문자
                answer[my_string.charAt(i)-65]++;
            } else if(my_string.charAt(i) > 96 && my_string.charAt(i) < 123) { //소문자
                answer[my_string.charAt(i)-71]++;
            }
        }

        return answer;
    }
}
