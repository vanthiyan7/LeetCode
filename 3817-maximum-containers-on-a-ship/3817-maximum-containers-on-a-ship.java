class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int i;
        for(i=1;i<=n*n;i++)
        if(i*w >maxWeight)
        return i-1;
        else if(i*w == maxWeight)
        return i;
        return n*n;
    }
}