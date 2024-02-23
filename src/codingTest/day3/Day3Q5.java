package codingTest.day3;

public class Day3Q5 {
    public int solution(int a, int b) {
        int answer1 = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        int answer2 = 2*a*b;

        if(answer1>=answer2){
            return answer1;
        } else {
            return answer2;
        }

    }
}
