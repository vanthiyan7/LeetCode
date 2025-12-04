/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    int n = numsSize;
    int *a = nums;
    *returnSize = 2;
    int *res = (int *) malloc(2 * sizeof(int));
    for(int i=0;i<n-1;i++)
    for(int j=i+1;j<n;j++)
    if(a[i] + a[j] == target)
    {
        res[0] = i;
        res[1] = j;
        return res;
    }
    return res;
    
}