package codingTest2.day12;

public class Day12Q3 {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]","");
        String[] arr = my_string.split("");
        int[] int_arr = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            int_arr[i] = Integer.parseInt(arr[i]);
        }

        for(int i=0; i<int_arr.length; i++){
            answer += int_arr[i];
        }
        return answer;
    }
}
