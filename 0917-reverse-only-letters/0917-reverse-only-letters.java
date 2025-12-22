class Solution {
    public String reverseOnlyLetters(String s) {
        int l=0 ,r = s.length()-1;
        char[] a = s.toCharArray();
        while(l<r)
        {
            if(!Character.isLetter(a[l]))
            l++;
            else if(!Character.isLetter(a[r]))
            r--;
            else
            {
                char c = a[l];
                a[l] = a[r];
                a[r] =  c;
                l++;
                r--;
            }
        }
        
        return new String(a); 
    }
}