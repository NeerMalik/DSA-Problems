class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
      int count=0;
      for(String s:words){
        boolean isall=true;
        for(char a:s.toCharArray()){
            if(allowed.indexOf(a)==-1){
                isall=false;
            }
           
        }
       if(isall==true){
                count++;
            }}  
      return count;
    }
}