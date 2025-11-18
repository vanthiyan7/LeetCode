class Solution {
    public boolean detectCapitalUse(String word) {
       if(word.equals(word.toUpperCase()) ||word.equals(word.toLowerCase())) 
       return true;
       String s = word.substring(0,1);
       String b= word.substring(1);
       if(s.equals(s.toUpperCase()) && b.equals(b.toLowerCase()))
       return true;
       return false;

    }
}