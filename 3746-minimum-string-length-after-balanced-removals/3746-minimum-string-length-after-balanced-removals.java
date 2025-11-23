class Solution {
    public int minLengthAfterRemovals(String s) {
        char[] a= s.toCharArray();
        int count_a = 0;
        int count_b = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i] == 'a')
            count_a++;
            else
            count_b++;
        }
        if(count_a == a.length || count_b == a.length)
        return a.length;
        else if(count_a > count_b || count_a < count_b )
        return Math.abs(count_a - count_b);
        else
        return 0;
    }
}