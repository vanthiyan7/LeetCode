class Solution {
    public String capitalizeTitle(String title) {
    String w[] =title.split(" ");
    for(int i=0;i<w.length;i++)
    {
        String words = w[i];
        if(w[i].length() <3)
        w[i] = words.toLowerCase();
        else
        {
             w[i] = words.substring(0,1).toUpperCase() + words.substring(1).toLowerCase();
        }  
    }
    return String.join(" ", w);
    }
}