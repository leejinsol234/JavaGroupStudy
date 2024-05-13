package codingTest2.day14;

public class Day14Q3 {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] array = cipher.split("");
        for(int i=code-1; i<array.length; i+=code){
            answer += array[i];
        }
        return answer;
    }
}
