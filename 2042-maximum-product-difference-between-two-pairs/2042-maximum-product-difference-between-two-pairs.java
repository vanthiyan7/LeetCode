class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int big = nums[nums.length -1] *nums[nums.length -2];
        int small  = nums[0]*nums[1];

        return big - small;
    }
}