class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int endPos = s.length() - 1; 
        
        while (i < endPos) {
           
            while (i < endPos && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
           
            while (i < endPos && !Character.isLetterOrDigit(s.charAt(endPos))) {
                endPos--;
            }
            
        
            if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(s.charAt(endPos))) {
                return false;  
            }
            
            i++;
            endPos--;
        }
        
        return true; 
    }
}
