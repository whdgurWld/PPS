#include <stdio.h>

int main(void) {
 int A,B,C, mul, tem;
  
 scanf("%d %d %d", &A, &B, &C);
 mul = A*B*C;
  
 int count[10];
 int num[10] = {0,};

 for(int i = 0; i<10; i++){
    count[i] = mul % 10;
    mul = mul/10;
    num[count[i]]++; 
    if(mul <= 0){
      break;
    }
 }
 for(int i = 0; i<10; i++){
  printf("%d\n", num[i]);  
 }
 

 return 0;

}
