package codingTest.day20;

public class Day20Q2 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int one = arr1.length;
        int two = arr2.length;

        if(one == two){
            int one_sum = 0;
            int two_sum = 0;
            for(int i=0; i<one; i++){
                one_sum += arr1[i];
            }
            for(int i=0; i<two; i++){
                two_sum += arr2[i];
            }

            if(one_sum<two_sum){
                answer = -1;
            } else if(one_sum>two_sum){
                answer = 1;
            } else if(one_sum==two_sum){
                answer = 0;
            }
        } else if(one<two){
            answer = -1;
        } else if(one>two){
            answer = 1;
        }

        return answer;
    }
}
