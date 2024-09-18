class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
       ArrayList<String> arr=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        String[] sentence1=s1.split(" ");
        String[] sentence2=s2.split(" ");
     
        for(String sentence:sentence1){
            map.put(sentence,map.getOrDefault(sentence, 0) + 1);
           
        }
         for(String sentence3:sentence2){
            map.put(sentence3,map.getOrDefault(sentence3, 0) + 1);
           
        }
        for(String word:map.keySet()){
            if(map.get(word)== 1){
                arr.add(word);
            }
            
        }
        return arr.toArray(new String[arr.size()]);
    }
}