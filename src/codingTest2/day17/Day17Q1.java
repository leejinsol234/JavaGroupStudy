package codingTest2.day17;

public class Day17Q1 {
    public int solution(int num, int k) {

        String num_str = Integer.toString(num);
        String[] arr = num_str.split("");

        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(Integer.toString(k))){
                return i+1;
            }
        }
        return -1;
    }
}
