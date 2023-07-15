#include <stdio.h>
#include <math.h>

int main(){

  int num[5];
  
  for(int i = 0; i < 5; i++){
    scanf("%d", &num[i]);
  }

  int sum = 0;
  for(int i = 0; i < 5; i++){
    sum+= pow(num[i],2);
  }

  int result = sum % 10;

  printf("%d", result);
  
  
  return 0;
}