class Solution {
    public int searchInsert(int[] nums, int target) {
         int index=0;
            boolean found=false;
        for(int i=0;i<nums.length;i++){
           
            if(nums[i]==target){
                index= i;
                found=true;
            }}
            if(found==false){
           for(int i=0;i<nums.length;i++){
            if(nums[nums.length-1]<target){
                index=nums.length;
            }
           else if(i<nums.length-1 && ((nums[i]<target)) && target<nums[i+1]){
                index=i+1;
            }
           }}
        


        return index;
    }
}