class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] a = new int[2];
        Set<Integer> set = new HashSet<>();
       for(int i=0;i<nums.length;i++)
       {
            if(set.contains(nums[i]))
            {
                set.remove(nums[i]);
                a[0]++ ;              
            }
            else
            set.add(nums[i]);
       }
       a[1] = set.size();
       return a;
    }
}