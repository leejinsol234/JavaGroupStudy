package codingTest.day12;

import java.util.ArrayList;

public class Day12Q3 {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> intList = new ArrayList<>();

        for(int i=0; i<intervals.length; i++){
            for(int j=intervals[i][0]; j<intervals[i][1]+1; j++){
                intList.add(arr[j]);
            }
        }

        return intList.stream().mapToInt(x -> x).toArray();
    }
}
