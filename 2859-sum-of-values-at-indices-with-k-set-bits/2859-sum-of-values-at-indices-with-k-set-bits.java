class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int d=0;
        for(int i=0; i<nums.size(); i++)
        {
            int c=0;
            String s = Integer.toBinaryString(i);
            System.out.println(s);
            int n = Integer.parseInt(s);
            System.out.println(n);
            while(n!=0)
            {
                if((n%10) == 1)
                c++;
                n = n/10;

            }
            if(c == k)
            d+=nums.get(i);
        }
        return d;
    }
}