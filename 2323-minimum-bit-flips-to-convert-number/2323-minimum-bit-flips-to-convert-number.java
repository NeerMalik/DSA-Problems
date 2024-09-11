class Solution {
    public int minBitFlips(int start, int goal) {
        int a=0;
        int c=start^goal;
      while(c!=0){
         a+=c&1;
        c>>=1;
        
      } 
      return a; 
    }
}