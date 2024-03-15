class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder merged = new StringBuilder();
        
        int i = 0, j = 0;
        
        // Iterate both strings
        while (i < word1.length() && j < word2.length()) {
            
            // Append letters
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(j));
            i++;
            j++;
        }
        
        // Append remaining letters from wrod1 if it still left any
        while (i < word1.length()) {
            merged.append(word1.charAt(i));
            i++;
        }

        // Append remaining letters from wrod2 if it still left any
        while (j < word2.length()) {
            merged.append(word2.charAt(j));
            j++;
        }
        
        return merged.toString();
        
    }
}