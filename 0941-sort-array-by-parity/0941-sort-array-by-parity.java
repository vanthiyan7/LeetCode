class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> a = new LinkedList<>();
        List<Integer> b = new LinkedList<>();
        
        for(int i = 0;i<nums.length;i++)
        {
        if(nums[i]%2==0)
        a.add(nums[i]);
        else
        b.add(nums[i]);
        }
        Collections.sort(a);
        Collections.sort(b,Collections.reverseOrder());
        List<Integer> ans = new LinkedList<>(a);
        ans.addAll(b);
        int c[] = new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        c[i] = ans.get(i);
        return c;
    }
}