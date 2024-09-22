class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<String> strings = new Stack<>();
        String currentString = "";
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Build the multiplier (k)
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                // Push the current count and string onto the stacks
                counts.push(k);
                strings.push(currentString);
                // Reset for the next segment
                k = 0;
                currentString = "";
            } else if (ch == ']') {
                // Decode the segment
                StringBuilder decodedString = new StringBuilder(strings.pop());
                int count = counts.pop();
                for (int i = 0; i < count; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString.toString();
            } else {
                // Add regular characters to the current string
                currentString += ch;
            }
        }

        return currentString;
    }
}