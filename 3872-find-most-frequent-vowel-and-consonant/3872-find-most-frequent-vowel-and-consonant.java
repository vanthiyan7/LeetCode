class Solution {
    public int maxFreqSum(String s) {
        int max=0,max1=0;
        Map<Character,Integer> m = new HashMap<>();
        Map<Character,Integer> m1 = new HashMap<>();
        for(char k:s.toCharArray())
        {
        if(k == 'a'||k == 'e'||k == 'i'||k == 'o'||k == 'u')
        m.merge(k,1,Integer::sum);
        else
        m1.merge(k,1,Integer::sum);
        }
        List<Integer> li = new ArrayList<>();
        for(Map.Entry<Character,Integer> e : m.entrySet())
        li.add(e.getValue());
        if(!li.isEmpty())
        max = li.stream().max((a,b) -> a.compareTo(b)).get();
         List<Integer> li1 = new ArrayList<>();
        for(Map.Entry<Character,Integer> e : m1.entrySet())
        li1.add(e.getValue());
        if(!li1.isEmpty())
        max1 = li1.stream().max((a,b) -> a.compareTo(b)).get();
        return max+max1;
       
    }
}