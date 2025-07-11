bool checkOnesSegment(char* s) {
    int n = strlen(s)-1;
    for(int i=0;i<=n;i++)
    if(s[i] == '0' && s[i+1] == '1')
    return false;
    return true;
    
    
}