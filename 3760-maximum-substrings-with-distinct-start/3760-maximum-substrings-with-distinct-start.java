class Solution {
    public int maxDistinct(String s) {
        char a[] = s.toCharArray();
        Set<Character> s1 = new HashSet<>();
        for(Character k: a)
        {
            s1.add(k);
        }
        return s1.size();
    }
}