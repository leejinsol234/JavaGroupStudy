package codingTest.day18;

public class Day18Q1 {
    public int[] solution(String myString) {
        String[] splitArr = myString.split("x",myString.length()); //두 번째 인자: 배열의 크기
        int[] answer = new int[splitArr.length];

        for(int i=0; i<splitArr.length; i++){
            answer[i] = splitArr[i].length();
        }
        return answer;
    }
}
