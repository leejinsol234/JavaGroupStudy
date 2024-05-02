package codingTest2.day9;

public class Day9Q2 {
    public String solution(String letter) {
        String answer = "";
        String[] morseList = {
                ".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--.."
        };

        String[] morse;
        morse = letter.split(" ");

        for(String s : morse){
            for(int i=0; i<morseList.length; i++){
                if(s.equals(morseList[i])){
                    answer += Character.toString(i+'a');
                }
            }
        }
        return answer;
    }
}
