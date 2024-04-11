class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        // Length should be the same
        if (word1.length() != word2.length())
            return false;

        int[] count1 = new int[26]; // Count of characters in word1 - only lowercase English letters
        int[] count2 = new int[26]; // Count of characters in word2 - only lowercase English letters

        for (char c : word1.toCharArray()) {
            count1[c - 'a']++;
        }

        for (char c : word2.toCharArray()) {
            count2[c - 'a']++;
        }

        System.out.println(count1 + " / ");
        System.out.println(count2 + " / ");
        
        // Check character frequencies whether it is same
        for (int i = 0; i < 26; i++) {
            if ((count1[i] == 0 && count2[i] != 0) || (count1[i] != 0 && count2[i] == 0))
                return false;
        }
        
        // Check if characters in one string can be rearranged to form the other string
        Arrays.sort(count1);
        Arrays.sort(count2);
        
        System.out.println(count1 + " / ");
        System.out.println(count2 + " / ");
        
        return Arrays.equals(count1, count2);
        
    }
}