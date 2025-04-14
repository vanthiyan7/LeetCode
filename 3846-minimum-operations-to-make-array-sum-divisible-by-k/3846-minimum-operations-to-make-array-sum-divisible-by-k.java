class Solution {
    public int minOperations(int[] nums, int k) {
        int n = Arrays.stream(nums).sum() % k;
        return n;
    }
}