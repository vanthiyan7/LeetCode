class Solution {
    public int[] twoSum(int[] a, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            int m= target-a[i];
            if(map.containsKey(m))
            return new int [] {i,map.get(m)};
            map.put(a[i],i);
        }
        return null;
    }
}