#include <stdio.h>

int main(){

  int num;

  scanf("%d", &num);

  int number[20];
  int sum[2] = {0,};
  for(int i = 0; i < num; i++){
    scanf("%d", &number[i]);
  }

  
  for(int i = 0; i < num; i++){
    sum[0]+= ((number[i]/30)+1)*10;
    sum[1]+= ((number[i]/60)+1)*15;
  }

  if(sum[0]>sum[1]) printf("M %d", sum[1]);
  else if(sum[0]<sum[1]) printf("Y %d", sum[0]);
  else printf("Y M %d", sum[0]);
  
  return 0;
}
