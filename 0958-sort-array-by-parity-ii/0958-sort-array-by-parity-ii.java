class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        List<Integer> a = new LinkedList<>();
        List<Integer> b = new LinkedList<>();
        
        for(int i = 0;i<nums.length;i++)
        {
        if(nums[i]%2==0)
        a.add(nums[i]);
        else
        b.add(nums[i]);
        }
        Collections.sort(b);
        Collections.sort(a,Collections.reverseOrder());
        int j=0,k=0;
        int c[] = new int[a.size()+b.size()];
        for(int i=0;i<a.size()+b.size();i++)
        {
        if(i % 2 == 0)
        c[i] = a.get(j++);
        else
        c[i] = b.get(k++);
         }
          return c;
    
    }
}