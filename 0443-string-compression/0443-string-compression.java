class Solution {
    public int compress(char[] chars) {
        if (chars == null || chars.length == 0) return 0; // Handle edge case
        
        ArrayList<String> result = new ArrayList<>();
        int count = 1;
        
        for (int i = 1; i <= chars.length; i++) {
            if (i < chars.length && chars[i] == chars[i - 1]) {
                count++; // Increment count if current character is same as previous
            } else {
                result.add(String.valueOf(chars[i - 1])); // Add previous character
                if (count > 1) {
                    result.add(String.valueOf(count)); // Add count of previous character if greater than 1
                }
                count = 1; // Reset count for the next character
            }
        }
        
        // Copy compressed characters back to the original array
        int index = 0;
        for (String str : result) {
            for (char c : str.toCharArray()) {
                chars[index++] = c;
            }
        }
        
        return index; // Return the new length of the array
    }
}