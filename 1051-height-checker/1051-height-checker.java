class Solution {
    public int heightChecker(int[] heights) {
        int h[] = new int[heights.length];
         h= Arrays.copyOf(heights,heights.length);
         Arrays.sort(h);
         int c =0;
         for(int i=0;i<heights.length;i++)
            if(heights[i]!=h[i])
            c++;
            return c;
    }
}