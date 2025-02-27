class Solution {
    public String longestNiceSubstring(String s) {
        // Base case: if the string is too short, no nice substring is possible
        if (s.length() <= 1) {
            return "";
        }

        String longest = "";

        // Iterate through all possible starting points for substrings
        for (int start = 0; start < s.length(); start++) {
            // Iterate through all possible ending points for substrings
            for (int end = start + 1; end <= s.length(); end++) {
                String substring = s.substring(start, end);
                
                // Check if the current substring is nice
                if (isNice(substring)) {
                    // Update the longest nice substring found so far
                    if (substring.length() > longest.length()) {
                        longest = substring;
                    }
                }
            }
        }
        return longest;
    }

    // Helper function to check if a string is nice
    private boolean isNice(String s) {
        boolean[] lower = new boolean[26]; // to track lowercase letters
        boolean[] upper = new boolean[26]; // to track uppercase letters

        // Iterate through the string to mark lowercase and uppercase characters
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lower[c - 'a'] = true;
            } else {
                upper[c - 'A'] = true;
            }
        }

        // Check if for every lowercase character, its corresponding uppercase exists, and vice versa
        for (int i = 0; i < 26; i++) {
            if (lower[i] && !upper[i] || upper[i] && !lower[i]) {
                return false; // If any lowercase or uppercase is missing its counterpart, it's not nice
            }
        }
        return true; // If all letters are paired, the string is nice
    }
}
