class Solution {
    public int countSymmetricIntegers(int low, int high){
        int cr=0,r;
        for(int i=low;i<=high;i++)
        {
            int s=0,s1=0;
            int c = (int)Math.log10(i)+1;
            if(c %2==0)
            {

            int n=i,c2 = c/2;
            while(n !=0)
            {
                r = n % 10;
                s = s+r;
                n = n /10;
                c--;
                if(c2 == c)
                break;
            }
            while(n !=0)
            {
                r = n % 10;
                s1 = s1+ r;
                n = n/ 10;
            }
            if(s == s1)
            cr++;
            }
            System.out.println(s);
            System.out.println(s1);
            
        }
        return cr;
    }
}