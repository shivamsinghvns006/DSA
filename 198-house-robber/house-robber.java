class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int n = nums.length;
        int[] maxMoney = new int[n];
        maxMoney[0] = nums[0];
        maxMoney[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
    
            maxMoney[i] = Math.max(maxMoney[i - 1], nums[i] + maxMoney[i - 2]);
        }

    
        return maxMoney[n - 1];
    }
}