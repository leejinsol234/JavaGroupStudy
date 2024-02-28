package codingTest.day8;

import java.util.Arrays;

public class Day8Q2 {
    public int solution(int a, int b, int c, int d) {
        int[] numbers = new int[7];
        numbers[a] += 1;
        numbers[b] += 1;
        numbers[c] += 1;
        numbers[d] += 1;

        int answer = 0, p = 0, q = 0, r = 0;
        int maxNum = Arrays.stream(numbers).max().getAsInt(); //배열 요소 중 최대값을 찾아 담기

        if (maxNum == 4) {          // 네 주사위에서 나온 숫자가 모두 같은 경우(한 인덱스에만 1이 4번 더해졌으므로)
            answer = 1111 * a;
        } else if (maxNum == 3) {   // 세 주사위에서 나온 숫자가 모두 같은 경우
            for (int idx = 0; idx < numbers.length; idx++) {
                if (numbers[idx] == 3) {
                    p = idx; //1이 3번 더해진 배열의 요소
                } else if (numbers[idx] == 1){
                    q = idx; //나머지 셋과 다른 배열의 요소
                }
                answer = (int) Math.pow(10 * p + q, 2);
            }
        } else if (maxNum == 2) {
            boolean contains = Arrays.stream(numbers).anyMatch(num -> num == 1);
            if (contains) {         // 어느 두 주사위에서 나온 값이 같고, 나머지 두 주사위의 값이 다른 경우
                for (int idx = 0; idx < numbers.length; idx++) {
                    if (numbers[idx] == 1) {
                        if (q == 0) {
                            q = idx;
                        } else {
                            r = idx;
                        }
                    }
                }
                answer = q * r;
            } else {                // 주사위가 두 개씩 같은 값이 나온 경우
                for (int idx = 0; idx < numbers.length; idx++) {
                    if (numbers[idx] == 2) {
                        if (p == 0) {
                            p = idx;
                        } else {
                            q = idx;
                        }
                    }
                }
                answer = (p + q) * (Math.abs(p - q));
            }
        } else {                    // 네 주사위에 적힌 숫자가 모두 다른 경우
            for (int idx = 0; idx < numbers.length; idx++) {
                if (numbers[idx] > 0) {
                    answer = idx; //가장 먼저 등장하는(가장 작은) 요소를 찾아 answer에 담고 빠져나감
                    break;
                }
            }
        }


        return answer;
    }
}
