class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 =nums1.length;
        int n2 =nums2.length;
        int c= n1+n2;
        int a[]=new int[c];
        int j=0;
        for(int i=0;i<n1;i++)
        a[j++]=nums1[i];
        for(int i=0;i<n2;i++)
        a[j++]=nums2[i];
        Arrays.sort(a);
        if(c%2==0)
        return (a[c/2-1]+a[c/2])/2.0;
        else
        return a[c/2];
    }
}