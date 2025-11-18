class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> l1 = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        for(int k:nums)
        s1.add(k);
        int j = nums[0];
        int k = nums[nums.length-1];
        for(int i=j;i<=k;i++)
        {
            if(!s1.contains(i))
                l1.add(i);
        }
        return l1;
    }
}