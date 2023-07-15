#include <stdio.h>

int main(){

  int num[4][2];

  for(int i = 0; i< 4; i++){
    for(int j = 0; j< 2; j++){
      scanf("%d", &num[i][j]);
    }
  }

  int max = num[0][1];

  int people = num[0][1];
  for(int i = 1; i < 4; i++){
    people = people - num[i][0] + num[i][1];

    if(people > max) max = people;
  }

  printf("%d", max);
  
  
  return 0;
}
