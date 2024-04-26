package codingTest2.day5;

public class Day5Q1 {
    public int solution(int price) {
        int answer = 0;
        double rate = 0;

        if(price<100000){
            rate = 0;
        } else if(price>=100000 && price<300000){
            rate = 0.05;
        } else if(price>=300000 && price<500000){
            rate = 0.10;
        } else if(price>=500000){
            rate = 0.20;
        }

        answer = (int)(price*(1.00-rate));

        return answer;
    }
}
