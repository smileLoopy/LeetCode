class Solution {
    public String reverseVowels(String s) {
        
        // Make a vowels list
        Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        // Change the string to char
        char[] characters = s.toCharArray();
        int i = 0;
        int j = s.length() -1;
        while(i < j) {
            while (i < j && !vowels.contains(characters[i])) { // If not containing vowels searching from left, continue searching
                i++;
            }
            while (i < j && !vowels.contains(characters[j])) { // If not containing vowels searching from right, continue searching
                j--;
                
            }
            
            // If it contains vowels from left and right -> swap it
            char temp = characters[i];
            characters[i] = characters[j];
            i++;
            characters[j] = temp;
            j--;
        }
        
        return new String(characters);
                
    }
}  