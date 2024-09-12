class Solution {
    public void rotate(int[] nums, int k) {
     int n=nums.length;
     k=k%n;
     int[] new1=new int[n];
     for(int i=0;i<n;i++){
        new1[(i+k)%n]=nums[i];
     }
     for(int i=0;i<n;i++){
        nums[i]=new1[i];
     }
    }
}