class Solution {
    public int strStr(String haystack, String needle) {
        char[] arr1=haystack.toCharArray();
        char[] arr2=needle.toCharArray();
        int k=-1;
        for(int i=0;i<=arr1.length-arr2.length;i++){
            boolean found=true;
            for(int j=0;j<arr2.length;j++){
            if(arr2[j]!=arr1[i+j]){
            found=false;
            break;}}
            if(found){
            return i;
}}
            return k;}}