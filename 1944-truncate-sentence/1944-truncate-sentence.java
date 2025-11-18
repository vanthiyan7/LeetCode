class Solution {
    public String truncateSentence(String s, int k) {
        String d="";
        String[] words = s.split(" ");
        for(int i=0;i<k;i++)
        d+=words[i]+" ";
        return d.trim();
    }
}