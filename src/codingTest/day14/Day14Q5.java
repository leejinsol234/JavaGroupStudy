package codingTest.day14;

public class Day14Q5 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            for(int i=s; i<=e; i++){
                arr[i] += 1;
            }
        }
        return arr;
    }
}
