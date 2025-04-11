char* removeStars(char* s) {
    char* c =malloc(10000000);
    int k=0,i=0;
    while(s[i] !='\0')
    {
        if(s[i] != '*')
        c[k++] = s[i];
        else
        k--;
        i++;
    }
    
    c[k] = '\0';
    int retrunSize =k;
    return c;
}