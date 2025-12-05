class Solution {
    public int countPartitions(int[] nums) {
        int c=0,r,s=0;
        for(int i=0;i<nums.length-1;i++)
        {
            s +=nums[i];
            int s1=0;
            for(int j=i+1;j<nums.length;j++)
                s1 +=nums[j];
                r = s - s1;
            if(r %2 ==0)
            c++;
        }
        return c;
    }
}