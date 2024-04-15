package codingTest.day22;

import java.math.BigInteger;

public class Day22Q2 {
    public String solution(String a, String b) {

        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        BigInteger sum = numA.add(numB);

        return sum.toString();
    }
}
