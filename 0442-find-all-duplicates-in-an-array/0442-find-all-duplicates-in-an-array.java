class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int k:nums)
        map.merge(k,1,Integer::sum);
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        if(e.getValue() >1)
        list.add(e.getKey());
        return list;
    }
}