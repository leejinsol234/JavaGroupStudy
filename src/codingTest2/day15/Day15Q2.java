package codingTest2.day15;

public class Day15Q2 {
    public String solution(String my_string, int num1, int num2) {

        String[] words = my_string.split("");

        String temp = words[num1];
        words[num1] = words[num2];
        words[num2] = temp;

        return String.join("",words);
    }
}
