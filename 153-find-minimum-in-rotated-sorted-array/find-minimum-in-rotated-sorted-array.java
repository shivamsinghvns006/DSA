
class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // Binary search
        while (left < right) {
            int mid = left + (right - left) / 2;

            // If the middle element is greater than last element
            if (nums[mid] > nums[right]) {
                // Minimum element lies in the right half
                left = mid + 1;
            } else {
                // Otherwise minimum element lies in the left half
                right = mid;
            }
        }

        // Return the minimum element
        return nums[left];
    }
}