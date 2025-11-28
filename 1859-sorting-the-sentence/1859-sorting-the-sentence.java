class Solution {
    public String sortSentence(String s) {
        String words[] = s.split(" ");
        String c="";
        for(int i = 0;i<words.length-1;i++)
        for(int j = i+1;j<words.length;j++)
        {
            if((words[i].charAt(words[i].length()-1))> (words[j].charAt(words[j].length()-1)))
            {
               c=  words[i];
               words[i] = words[j];
               words[j] = c;
            }
        }
        String d="";
        for(int i=0;i<words.length;i++)
        {
            d+= words[i].substring(0, words[i].length() - 1)+" ";
        }
       
       
        return d.trim();
    }
}