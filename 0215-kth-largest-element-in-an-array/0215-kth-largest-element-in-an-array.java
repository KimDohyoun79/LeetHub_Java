class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        
        return nums[nums.length - k];
    }
}