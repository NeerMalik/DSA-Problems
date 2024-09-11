class Solution {
    public int reverse(int x) {
    long c = 0;
 long z = x; 
while (z != 0) {
long a = z % 10;
 if (c > (Integer.MAX_VALUE - a) / 10) {
 return 0;
 }
   c = c * 10 + a;
 z = z / 10;
}
if (c > Integer.MAX_VALUE || c < Integer.MIN_VALUE) {
 return 0;
 }
  return (int) c;
    }}