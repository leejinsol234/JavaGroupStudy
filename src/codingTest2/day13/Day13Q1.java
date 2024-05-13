package codingTest2.day13;

public class Day13Q1 {
    public int solution(String s) {
        int answer = 0;
        String[] list = s.split(" ");
        for(int i=0; i<list.length; i++){
            if(list[i].equals("Z")){
                answer -= Integer.parseInt(list[i-1]);
            } else {
                answer += Integer.parseInt(list[i]);
            }
        }
        return answer;
    }
}
