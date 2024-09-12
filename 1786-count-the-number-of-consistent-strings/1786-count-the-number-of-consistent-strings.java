class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            boolean isConsistent = true;

            for (int k = 0; k < words[i].length(); k++) {
                char ch = words[i].charAt(k);

                boolean found = false;
                for (int j = 0; j < allowed.length(); j++) {
                    if (ch == allowed.charAt(j)) {
                        found = true;
                        break; 
                    }
                }
                if (!found) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                count++;
            }
        } return count;
    }
}
