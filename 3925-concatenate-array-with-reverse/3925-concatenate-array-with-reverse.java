class Solution {
    public int[] concatWithReverse(int[] nums) {
        int a[]= Arrays.copyOf(nums,nums.length*2);
        int n = nums.length;
        for(int i= nums.length-1;i>=0;i--)
        {
        a[n++] = nums[i];
        System.out.println(a[i]);
        }return a;        
       }
}