class Solution {
    public int longestSubarray(int[] nums) {
        if (nums.length == 0) return 0;      
        int max = nums[0];  
        int c = 0;  
        int d = 0;  
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                c++;  
            } else {
                if (c > d) {
                    d = c;
                }
                c = 0; 
            }
        }

        if (c > d) {
            d = c;
        }

        return d;
    }
}
