class Solution {
    public String gcdOfStrings(String str1, String str2) {
        
        //EX) str1 = "ABCABC", str2 = "ABC"
        // Check if str1 is equal to str2 concatenated with itself
        if (!(str1 + str2).equals(str2 + str1)) { //ABCABCABC //ABCABCABC //LEETCODE // CODELEET -> ""
            return "";
        }
        
        // Find the length of the greatest common divisor
        int len1 = str1.length(); //6
        int len2 = str2.length(); //3
        int gcdLength = gcd(len1, len2); // 3
        
        // Return the substring of str1 up to the length of the GCD
        return str1.substring(0, gcdLength); //ABC
        
    }
    
    // Euclidean algorithm to find the greatest common divisor
    private static int gcd(int a, int b) {
        // Step1: Start the while loop with b != 0
        while (b != 0) { // 3 != 0
            // Step 2: Swap values if necessary to ensure a >= b
            int temp = b; // temp = 3
            b = a % b; // b = 6%3 = 0 
            a = temp; // a = 3
            
            // Step 3: Repeat until b becomes 0
        }
        // Step 4: Return the value of a, which is the GCD
        return a;
    }
}


