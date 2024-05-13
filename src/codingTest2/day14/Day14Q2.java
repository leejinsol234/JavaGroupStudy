package codingTest2.day14;

public class Day14Q2 {
    public int solution(int order) {
        int answer = 0;
        String game = order+"";
        String[] list = game.split("");

        for(int i=0; i<list.length; i++){
            if(list[i].equals("3") || list[i].equals("6") || list[i].equals("9")){
                answer++;
            }
        }
        return answer;
    }
}
