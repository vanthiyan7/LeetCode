class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2)
        return 0;
        Arrays.sort(nums);
        int c=0;
        for(int i=0;i<nums.length-1;i++)
        {
            int d = nums[i+1] - nums[i]; 
            if(c<d)
            c =d;
        }
        return c;
    }
}