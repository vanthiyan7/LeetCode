int minimumOperations(int* nums, int numsSize) {
    int i,c=0;
    for(i=0;i<numsSize;i++)
        if(nums[i] % 3 != 0)
       c++;
       return c;
}