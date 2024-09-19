import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> no1 = new HashMap<>();
        int[] arr1 = arr.clone(); 
        Arrays.sort(arr); 
      
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                continue; 
            } else {
                no1.put(arr[i], no1.size() + 1); 
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = no1.get(arr1[i]);
        }

        return arr1; 
    }
}
