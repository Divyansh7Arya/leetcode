import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        // BigInteger x = new BigInteger(a,2);
        // BigInteger y = new BigInteger(b,2);
        // BigInteger z = new BigInteger(a,2);
        // z = x.add(y);
        // return z.toString(2);
        return new java.math.BigInteger(a, 2).add(new java.math.BigInteger(b, 2)).toString(2);
    }
}