class Solution {
    public int maxCoins(int[] nums) {
        Arrays.sort(nums);
        int s=0;
        for(int i=nums.length/3;i<nums.length;i+=2)
        {
        s+=nums[i];
        System.out.println(s);
        }
        return s;
    }
}