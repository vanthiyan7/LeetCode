class Solution {
    public int triangularSum(int[] nums) {
        int j=nums.length;
        while(j >=1)
        {
            for(int i=0;i<j-1;i++)
            nums[i] =(nums[i]+ nums[i+1]) % 10;
            j--;
        }
        return nums[0];
    }
}