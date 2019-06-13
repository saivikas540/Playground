// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int i,n,a,flag;
  scanf("%d",&n);
  for(i=1;i<n/2;i++)
  {
    if(n%2==0)
    {
      flag=1;
      break;
    }}
  if(n==1||n==0){
  printf("neither");}
  else if(flag==0)
  {
    printf("prime");
  }
    else
    {
      printf("composite");
  }return 0;
}