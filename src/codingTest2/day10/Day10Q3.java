package codingTest2.day10;

public class Day10Q3 {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;

        for(int i=1; i<k; i++){
            index += 2;
        }

        index %= numbers.length;
        answer = numbers[index];
        return answer;
    }
}