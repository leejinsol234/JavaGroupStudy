package codingTest.day4;

public class Day4Q4 {
    public int solution(String ineq, String eq, int n, int m) {

        if(ineq.equals(">")){
            if(eq.equals("=")){
                return n >= m ? 1 : 0;
            } else if (eq.equals("!")){
                return n > m ? 1 : 0;
            }
        } else if(ineq.equals("<")){
            if(eq.equals("=")){
                return n <= m ? 1 : 0;
            } else if(eq.equals("!")){
                return n < m ? 1 : 0;
            }
        }

        return 0;
    }
}
