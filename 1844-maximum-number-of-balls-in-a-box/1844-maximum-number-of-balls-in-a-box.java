class Solution {
    public int countBalls(int lowLimit, int highLimit) {
    int m; 
    int a[]= new int[46];

    for(int i=lowLimit;i<=highLimit;i++)
    {   m = i;
        int r,s=0;
        while(m !=0)
        { 
            r = m% 10;
            s = s+r;
            m = m/10;

        }
        a[s]++;
    }
    
        return Arrays.stream(a).max().getAsInt();
    }
}