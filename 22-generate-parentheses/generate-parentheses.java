import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack("", 0, 0, n, result);
        return result;
    }

    private void backtrack(String s, int open, int close, int n, List<String> result) {
        // Base case: if string length is 2n, add to result
        if (s.length() == 2 * n) {
            result.add(s);
            return;
        }

        // Add open parenthesis if less than n
        if (open < n) {
            backtrack(s + "(", open + 1, close, n, result);
        }

        // Add close parenthesis if less than open
        if (close < open) {
            backtrack(s + ")", open, close + 1, n, result);
        }
    }
}