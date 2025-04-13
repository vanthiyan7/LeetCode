class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int n = nums.length;
      int c=0,max=0;
      for(int i=0;i<n;i++)
      {
        if(nums[i] !=1)
        c = 0;
        else
        c++;
        if(c>max)
        max  = c;
      }
      return max;
    }
}