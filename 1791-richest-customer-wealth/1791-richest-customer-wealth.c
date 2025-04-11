int maximumWealth(int** a, int r, int* c) {
    int big  =0,s;
    for(int i =0;i<r;i++)
    {
        s=0;
    for(int j=0;j<*c;j++)
    s = s+a[i][j];
    if(big<s)
    big = s;
    }
    return big;
}