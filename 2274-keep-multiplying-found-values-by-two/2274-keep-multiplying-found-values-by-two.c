int findFinalValue(int* nums, int numsSize, int original) {
    for(int i=0;i<numsSize;i++)
    for(int j =0;j<numsSize;j++)
    if(original == nums[j])
    original = 2 * original;

    return original;
}