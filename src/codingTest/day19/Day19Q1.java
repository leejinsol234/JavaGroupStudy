package codingTest.day19;

import java.util.ArrayList;
import java.util.List;

public class Day19Q1 {
    public List<String> solution(String myStr) {
        List<String> answer = new ArrayList<String>();

        String parted = "";

        for(int i=0; i<myStr.length(); i++){
            char value = myStr.charAt(i);

            if(value == 'a' || value == 'b' || value == 'c'){
                if(parted != ""){
                    answer.add(parted);
                    parted = "";
                }
            } else {
                parted += value;
            }
        }
        if(parted!=""){
            answer.add(parted);
            parted="";
        }
        if(answer.size()==0) answer.add("EMPTY");
        return answer;
    }
}
