class Solution {
    public int sumBase(int n, int k) {
        int s =0,r;
        while(n>0)
        {
           r = n % k;
           s = s + r;
           n = n /k; 
        }
        return s;
    }
}