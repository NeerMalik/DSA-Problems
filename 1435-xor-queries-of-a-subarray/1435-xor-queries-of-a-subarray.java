class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] xor=new int [arr.length];
        int[] return1=new int[queries.length];
        xor[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            xor[i]=arr[i]^xor[i-1];
        }
        for(int i=0;i<queries.length;i++){
            int a=queries[i][0];
            int b=queries[i][1];
            if(a==0){
                return1[i]=xor[b];
                
            }
            else{
                return1[i]=xor[b]^xor[a-1];
            }
        }
        return return1;
    }
}