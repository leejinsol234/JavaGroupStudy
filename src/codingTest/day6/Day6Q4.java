package codingTest.day6;

public class Day6Q4 {
    public int[] solution(int[] arr, int[][] queries) {

        int e;

        for(int i=0; i<queries.length; i++){
            e = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = e;
        }
        return arr;
    }
}
