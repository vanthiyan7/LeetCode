class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int a[] = new int[nums.length];
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
        if(i %2 ==0)
        list1.add(nums[i]);
        else
        list2.add(nums[i]);
        }
        Collections.sort(list1);
        Collections.sort(list2,Collections.reverseOrder());
        int k=0;
        for(int i=0;i<list1.size();i++)
        {
        a[k] =list1.get(i);
        k+=2; 
        }
        int j=1;
        for(int i=0;i<list2.size();i++)
        {
        a[j] =list2.get(i);
        j+=2; 
        }
        return a;
    }
}