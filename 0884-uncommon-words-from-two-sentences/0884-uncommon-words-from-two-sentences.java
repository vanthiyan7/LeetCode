class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
       Map<String,Integer> map = new HashMap<>();
       List<String> list = new ArrayList<>();
       String [] b = s1.split(" ");
       String [] c = s2.split(" ");
        for(int i = 0 ;i<b.length;i++)
        map.merge(b[i],1,Integer::sum);
        for(int i = 0;i<c.length;i++)
        map.merge(c[i],1,Integer::sum);
        for(Map.Entry<String,Integer> e:map.entrySet())
        if(e.getValue()==1)
        list.add(e.getKey());
        String[] a = new String[list.size()];
        for(int i=0;i<list.size();i++)
        a[i] = list.get(i);
        return a;
        }
}