class Solution {
    public int mySqrt(int x) {
        if  (x==0){
            return 0;
        }
        long sqrt = x;
        while(sqrt*sqrt > x){
            sqrt = (sqrt + (x / sqrt)) / 2;
        }
        return (int) sqrt;
    }
    
}

