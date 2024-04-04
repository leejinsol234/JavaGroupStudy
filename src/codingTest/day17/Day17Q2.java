package codingTest.day17;

public class Day17Q2 {
    public int solution(String myString, String pat) {

        int count = 0;
        for(int i=0; i<myString.length()-pat.length()+1; i++){
            if(myString.substring(i, i+pat.length()).contains(pat)){
                count++;
            }
        }
        return count;
    }
}
