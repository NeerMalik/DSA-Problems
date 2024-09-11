class Solution {
    public int lengthOfLastWord(String s) {
        char[] Char1 = s.toCharArray();
        int a = 0; 
        int k = 0; 

        for (int i = Char1.length - 1; i >= 0; i--) {
            if (Char1[i] == ' ') {  
                if (k > 0) break; 
                a++;  
            } else {
                k++; 
            }
        }
        
        return k;
    }
}
