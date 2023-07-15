#include <stdio.h>

int main(){
  int size;
  int num[1000];
  int sum[1000] = {0};
  float average[1000] = {0};
  
  scanf("%d", &size);

  int count;
  for(int i = 0; i < size; i++){
    scanf("%d", &count);

    for(int j = 0; j < count; j++){
      scanf("%d", &num[j]);
      sum[i]+= num[j];
    }

    average[i] = sum[i] / count;

    int above_average = 0;
    for(int j = 0; j < count; j++){
      if(num[j] > average[i]) above_average++;
    }

    average[i] = (above_average / (float) count) * 100;
  }

  for(int i = 0; i < size; i++){
    printf("%0.3f%%\n", average[i]);
  }
  
  return 0;
  
}

