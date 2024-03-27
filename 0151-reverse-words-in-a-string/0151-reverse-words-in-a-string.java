class Solution {
    public String reverseWords(String s) {
        
        StringBuilder result = new StringBuilder(); // StringBuilder: It allows you to modify the contents of the string without creating a new object
        
        s = s.trim();
        String[] words = s.split(" "); // Collect the words in the array
        
        for(int i=words.length-1 ; i >= 0; i--) { // Reverse it -> Find it from the behind
            
            if(words[i].length() > 0) {
                
                result.append(words[i]);
                
                if(i > 0) { // If not the last one insert space
                    result.append(' ');
                }
            }
        }
        
        return result.toString();
        
    }
}