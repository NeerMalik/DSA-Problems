class Solution {
    public int sumOfMultiples(int n) {
        if(n==1 || n<0 || n==0 || n==2) return 0;
        int sum=0;
        while(n>2){
            if(n%3==0 ||n%5==0 ||n%7==0){
                sum+=n;
            }
                n=n-1;
               
           
        }
        return sum;
    }
}