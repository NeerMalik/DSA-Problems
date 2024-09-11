class Solution {
    public boolean isValid(String s) {
       if(s.length()<=1){
        return false;
       } 
       Stack<Character> stack=new Stack<>();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='('){
            stack.push(s.charAt(i));
        }
        else if(stack.empty()){
            return false;
        }
        else{
            if(s.charAt(i)==')'){
                if(stack.pop()!='('){
                    return false;
                }
              
            }
            if(s.charAt(i)=='}'){
                if(stack.pop()!='{'){
                    return false;
                }
                
            }
            if(s.charAt(i)==']'){
                if(stack.pop()!='['){
                    return false;
                }
               
            }
        }
       }
       if(stack.empty())return true;
      
       return false;
    }
}