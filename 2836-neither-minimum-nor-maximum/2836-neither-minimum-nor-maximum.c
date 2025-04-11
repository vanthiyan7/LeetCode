int findNonMinOrMax(int* nums, int numsSize) {
    int big = nums[0];
    for(int  i=0;i<numsSize;i++)
    if(nums[i] > big)
    big =  nums[i];
     int small= nums[0];
    for(int  i=0;i<numsSize;i++)
    if(nums[i] < small)
    small =  nums[i];
    for(int i=0;i<numsSize;i++)
    if(nums[i] != big  && nums[i] != small )
    return nums[i];
    return -1;

}