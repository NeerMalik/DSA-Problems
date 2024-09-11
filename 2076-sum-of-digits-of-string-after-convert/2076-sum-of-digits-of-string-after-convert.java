import java.math.BigInteger;

class Solution {
    public int getLucky(String s, int k) {
        String str = "";
        
      
        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i) - 'a' + 1; 
            str += value;
        }
        
     
        BigInteger num = new BigInteger(str);
        
    
        while (k > 0) {
            num = BigInteger.valueOf(sumOfDigits(num));
            k--;
        }
        
        return num.intValue();
    }
  
    public int sumOfDigits(BigInteger n) {
        int sum = 0;
        while (n.compareTo(BigInteger.ZERO) > 0) {
            sum += n.mod(BigInteger.TEN).intValue(); 
            n = n.divide(BigInteger.TEN);     
        }
        return sum;
    }
}
