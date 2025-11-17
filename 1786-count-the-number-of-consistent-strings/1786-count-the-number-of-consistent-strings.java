class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> s1 = new HashSet<>();
        for(char k : allowed.toCharArray())
        s1.add(k);
    int c=0;
        for(String k:words)
        {
            int f=1;
            for(char wc: k.toCharArray())
            {
                if(!s1.contains(wc))
                {
                f = 0;            
                break;
                }
            }
                if(f==1)
                c++;
        }
        return c;
    }
}