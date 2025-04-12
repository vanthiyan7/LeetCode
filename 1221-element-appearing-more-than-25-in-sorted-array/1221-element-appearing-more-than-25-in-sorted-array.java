class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int k:arr)
        map.merge(k,1,Integer::sum);
        for(Map.Entry<Integer,Integer> e :map.entrySet())
        list.add(e.getValue());
       int max = list.stream().max((a,b) -> a.compareTo(b)).get();
        for(Map.Entry<Integer,Integer> e :map.entrySet())
        if(e.getValue() == max)
        return e.getKey();
        return 0;
    }
}