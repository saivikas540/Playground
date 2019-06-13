#include<stdio.h>
int main()
{
  int n,rem,base=1,number=0;
  scanf("%d",&n);
  while(n>0)
  {
    rem=n%10;
    number=number+rem*base;
    n=n/10;
    base=base*2;
  }
  printf("%d",number);
  return 0;
}