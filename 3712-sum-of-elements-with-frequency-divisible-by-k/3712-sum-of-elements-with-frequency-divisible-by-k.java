class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int l:nums)
        map.merge(l,1,Integer::sum); 
        int m=0;
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        if(e.getValue() % k ==0 )
        m += e.getValue()* e.getKey();
        return m;
    }
}