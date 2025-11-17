class Solution {
    public boolean kLengthApart(int[] nums, int k) {
       
        for(int i=0;i<nums.length;i++)

        {
            
            if(nums[i]==1)
            {
                int j=i+1;
                int c=0;
                while(j< nums.length && nums[j] != 1 )
                {
                    if(nums[j]==0)
                    c++;
                    j++;
                }  
                if(c<k && j!=nums.length)
            return false;         
            }  
            
        }
        return true;
    }
}