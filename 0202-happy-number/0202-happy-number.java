class Solution {
    public boolean isHappy(int n) {
        while (n > 9) {  
            n = happyno(n);  
        }
        return n == 1 || n == 7;  
    }

    public int happyno(int no) {
        int sum = 0;
        while (no > 0) {
            int x = no % 10;  
            sum += x * x;  
            no /= 10;  
        }
        return sum; 
    }
}
