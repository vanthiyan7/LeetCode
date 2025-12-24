class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length;
        int res=0;
        for(int i=0;i<n-1;i++)
        {
            int a = points[i][0];
            int b = points[i][1];

            int x = points[i+1][0];
            int y = points[i+1][1];

            res =res+Math.max(Math.abs(a-x) , Math.abs(b - y));
        }
        return res;
    }
}