class Solution {
    public int singleNumber(int[] nums) {
        // Initialize result as 0
        int result = 0;

        // XOR all numbers together
        for (int num : nums) {
            result ^= num;
        }

        // Return the final result
        return result;
    }
}