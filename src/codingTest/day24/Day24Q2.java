package codingTest.day24;

import java.util.ArrayList;
import java.util.List;

public class Day24Q2 {
    public String[] solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
        for(int i=0; i<picture.length; i++){
            String[] bigger = picture[i].split("");
            String str = "";
            for(int j=0; j<bigger.length; j++){
                str += bigger[j].repeat(k);
            }
            for(int j=0; j<k; j++){
                answer.add(str);
            }
        }
        return answer.toArray(new String[answer.size()]);
    }
}
