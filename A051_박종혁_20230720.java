// import java.util.Scanner;


// class Main {
//     public static void main(String args[]){

//         Scanner in = new Scanner(System.in);
//         String s = in.nextLine();
//         in.close();
        
//         int answer = 0;

//         for(int i = 0; i < s.length(); i++){
//             answer+= retNum(s.charAt(i));
//         }

        
//         System.out.println(answer);
//     }

//     public static int retNum(Character c){
//         if(c >= 65 && c<= 67) return 3; //ABC
//         else if(c >= 68 && c <= 70) return 4; //DEF
//         else if(c >= 71 && c <= 73) return 5; //GHI
//         else if(c >= 74 && c <= 76) return 6; //JKL
//         else if(c >= 77 && c <= 79) return 7; //MNO
//         else if(c >= 80 && c <= 83) return 8; //PQRS
//         else if(c >= 84 && c <= 86) return 9; //TUV
//         else if(c >= 87 && c <= 90) return 10; //WXYZ
//         else if(c == '+' || c == '-' || c == '*' || c == '/') return 11;
//         else return 0;
//     }

// }
