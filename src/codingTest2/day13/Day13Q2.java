package codingTest2.day13;

public class Day13Q2 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for(int i=0; i<strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
