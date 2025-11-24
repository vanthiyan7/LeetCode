class Solution {
    public int reverseDegree(String s) {
        char c[] = s.toCharArray();
        int s1 =0;
        for(int i=0;i<c.length;i++)
        {
            int k = Math.abs((c[i]-96) -27);
            k = k *(i+1);
            s1+=k;
        }
        return s1;
    }
}