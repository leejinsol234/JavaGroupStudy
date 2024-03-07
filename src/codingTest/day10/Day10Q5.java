package codingTest.day10;

import java.util.ArrayList;
import java.util.List;

public class Day10Q5 {
    public String solution(int q, int r, String code) {
        List answer = new ArrayList<>();
        String s = "";

        for(int i=0; i<code.length(); i++){
            char c = code.charAt(i);
            answer.add(String.valueOf(c));
        }

        for(int i=0; i<answer.size(); i++){
            if(i%q ==r){
                s += answer.get(i);
            }
        }
        return s;
    }
}
