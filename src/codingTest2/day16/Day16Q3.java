package codingTest2.day16;

public class Day16Q3 {
    public int solution(String my_string) {
        int answer = 0;
        String[] cal = my_string.split(" ");

        answer += Integer.parseInt(cal[0]);

        for(int i=1; i<cal.length-1; i++){
            if(cal[i].equals("+")){
                answer += Integer.parseInt(cal[i+1]);
            } else if(cal[i].equals("-")){
                answer -= Integer.parseInt(cal[i+1]);
            }

        }
        return answer;
    }
}
