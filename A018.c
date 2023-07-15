#include <stdio.h>
#include <math.h>

int findmax(int array[], int size);
int findmin(int array[], int size);

int main(){

  int size;

  scanf("%d", &size);

  int array_A[50];
  int array_B[50];

  for(int i = 0; i < size; i++){
    scanf("%d", &array_A[i]);
  }

  for(int i = 0; i < size; i++){
    scanf("%d", &array_B[i]);
  }

  int sum=0;
  for(int i = 0; i < size; i++){
    int index_a =findmin(array_A, size);
    int index_b =findmax(array_B, size);

    //printf("%d) %d * %d\n", i+1, array_A[index_a], array_B[index_b]);
    sum+= array_A[index_a] * array_B[index_b];

    array_A[index_a] = -1;
    array_B[index_b] = -1;
  }

  printf("%d", sum);
  return 0;
}

int findmax(int array[], int size){
  int max = 0;
  int index;
  for(int i = 0; i < size; i++){
    if(max <= array[i] && array[i] != -1){
      max= array[i];
      index = i;
    }
  }

  return index;
}

int findmin(int array[], int size){
  int min = 100;
  int index;
  for(int i = 0; i < size; i++){
    if(min >= array[i] && array[i] != -1){
      min= array[i];
      index = i;
    }
  }

  return index;
}