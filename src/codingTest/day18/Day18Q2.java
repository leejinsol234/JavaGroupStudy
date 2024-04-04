package codingTest.day18;

import java.util.ArrayList;
import java.util.Arrays;

public class Day18Q2 {
    public String[] solution(String myString) {
        String[] splitArr = myString.split("x");
        ArrayList<String> list = new ArrayList<>();

        for(String str : splitArr){
            if(!str.isEmpty()){
                list.add(str);
            }
        }

        String[] answer = new String[list.size()];
        list.toArray(answer);
        Arrays.sort(answer);


        return answer;
    }
}
