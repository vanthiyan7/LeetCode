class Solution {
    public int alternatingSum(int[] nums) {
        int s=0,s1=0;
        // if(nums.length == 1)
        // return nums[0];
        for(int i=0;i<nums.length;i++)
        {
        if (i%2 == 0)
        s+=nums[i];
        else
        s1+=nums[i];
        }
        return s- s1;
    }
}