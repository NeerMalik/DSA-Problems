class Solution {
    public int chalkReplacer(int[] chalk, int k) {
     int sum=0;
     for(int i=0;i<chalk.length;i++){
        sum+=chalk[i];
     }  
     
     
     int l=0;
while(l<k) {
     for(int i=0;i<chalk.length;i++){
        l+=chalk[i];
        if(l>k){
            return i;
        }
     }}
     return 0;
    }
}