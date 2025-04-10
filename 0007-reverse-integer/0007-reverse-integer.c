long reverse(long  x){
    long s= 0;
    while(x)
    {   int r = x % 10;
         s = s *10 + r;
         if(!(s >= pow(-2,31) && s <= pow(2,31)-1))
         return 0;
         x = x / 10;
    }
    return s;
}