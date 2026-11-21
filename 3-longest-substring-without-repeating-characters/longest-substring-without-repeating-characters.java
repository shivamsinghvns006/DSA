import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> charIndex = new HashMap<>();

        int maxLength = 0;

        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
     
            if (charIndex.containsKey(c) && charIndex.get(c) >= start) {
        
                start = charIndex.get(c) + 1;
            } else {
      
                maxLength = Math.max(maxLength, i - start + 1);
            }

            charIndex.put(c, i);
        }

        return maxLength;
    }
}
