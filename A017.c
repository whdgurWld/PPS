#include <stdio.h>

int main(){

  int num;

  scanf("%d", &num);
  
  int number[9] = {0};
  int index = 0;
  
  while(num>0){
    if(num % 10 == 0) number[index] = -1;
    else number[index] = num % 10;
    num = num/10;
    index++;
  }

  int count = 0;
  while(1){
    int list_in_set[10] = {-1,1,2,3,4,5,6,7,8,9};
    count++;
    
    int used = 0;
    
    for(int i = 0; i < 9; i++){
      for(int j = 0; j < 10; j++){
        
        if(used < 2 && ((number[i] == 6) || (number[i] == 9))){
          used++;
          number[i] = 0;
          if(list_in_set[6] == 6) list_in_set[6] = 0;
          else list_in_set[9] = 0;
        }
          
        else if(number[i] == list_in_set[j]){
          
          number[i] = 0;
          list_in_set[j] = 0;
        }
        
      }
    }

    int end = 1;
    for(int i = 0; i < 9; i++){
      if(number[i] != 0){
        end = 1;
        break;
      }
      end = 0;
    }

    if(end == 0) break;
  }
  
  printf("%d", count);
  
  return 0;
}
