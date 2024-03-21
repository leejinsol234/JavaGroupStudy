package codingTest.day14;

import java.util.ArrayList;

public class Day14Q3 {
    public String[] solution(String[] todo_list, boolean[] finished) {

        ArrayList<String> arr = new ArrayList<>();

        for(int i=0; i<todo_list.length; i++){
            if(!finished[i]){
                arr.add(todo_list[i]);
            }
        }

        String[] answer = new String[arr.size()];
        answer = arr.toArray(answer);

        return answer;
    }
}
