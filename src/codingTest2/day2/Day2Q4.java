package codingTest2.day2;

public class Day2Q4 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i<numbers.length; i++){
            answer[i] = numbers[i]*2;
        }

        return answer;
    }
}
