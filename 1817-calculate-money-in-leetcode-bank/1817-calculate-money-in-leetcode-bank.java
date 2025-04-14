class Solution {
    public int totalMoney(int n) {
        int s=1,m=1,c=0;
        for(int i=1;i<=n;i++)
        {
            c+=s;
            s++;
            if(i%7==0)
            {
            m +=1;
            s =m;
            }    
        }  
        return c;
    }
}