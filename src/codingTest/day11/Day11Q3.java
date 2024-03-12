package codingTest.day11;

public class Day11Q3 {
    public String solution(String my_string, int[] indices) {
        String[] strArr = my_string.split("");
        for(int i : indices){
            strArr[i] = "";
        }

        return String.join("",strArr);
    }
}
