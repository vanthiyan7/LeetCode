void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n) {
    int r= m+n;
    int i,j=0,c;
    for(i=0;i<nums1Size;i++)
    if(i>=m)
    {
    nums1[i]=nums2[j];
    j++;
    }
    for(i=0;i<r-1;i++)
    for(j=i+1;j<r;j++)
    if(nums1[i]>nums1[j])
    {
        c = nums1[i];
        nums1[i]=nums1[j];
        nums1[j]=c;
    }
    for(i=0;i<r;i++)
    printf("%d",nums1[i]);
}