class Solution {
    public String reversePrefix(String s, int k) {
        if(k <=1)
        return s;
        
        char [] c = s.toCharArray();
        int left = 0;
        int right = k-1;
        while(left< right)
        {
            char d = c[left];
            c[left] = c[right];
            c[right] = d;
            left++;
            right--;
        }
        return new String(c);
    }
}