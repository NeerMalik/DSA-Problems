class Solution {
    public int climbStairs(int n) {
    return fibonicci(n);}
public int fibonicci(int n){
    int a=1;
    int b=1;
    int c=1;
    while(n>1){
        c=a+b;
        a=b;
        b=c;
        n--;}
return c;
}}
