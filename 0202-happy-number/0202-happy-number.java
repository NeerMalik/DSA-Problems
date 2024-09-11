class Solution {
    public boolean isHappy(int n) {
        while (n > 9) {  // Keep processing until the number is a single digit
            n = happyno(n);  // Get the sum of squares of digits
        }
        return n == 1 || n == 7;  // Return true if n is 1 or 7 (since 7 is a happy number)
    }

    public int happyno(int no) {
        int sum = 0;
        while (no > 0) {
            int x = no % 10;  // Extract the last digit
            sum += x * x;  // Add the square of the digit to the sum
            no /= 10;  // Remove the last digit
        }
        return sum;  // Return the sum of squares of digits
    }
}
