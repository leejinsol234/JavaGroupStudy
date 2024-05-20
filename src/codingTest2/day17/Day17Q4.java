package codingTest2.day17;

public class Day17Q4 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] part = new String[quiz.length];

        for(int i=0; i<quiz.length; i++){
            part = quiz[i].split(" ");

            if(part[1].equals("+")){
                if(Integer.parseInt(part[0])+Integer.parseInt(part[2]) == Integer.parseInt(part[4])){
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if(part[1].equals("-")){
                if(Integer.parseInt(part[0])-Integer.parseInt(part[2]) == Integer.parseInt(part[4])){
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }

            }
        }


        return answer;
    }
}
