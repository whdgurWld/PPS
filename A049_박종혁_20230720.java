import java.util.Scanner;


class Main {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        
        String s = in.nextLine();
        while(!s.equals("end")){
            boolean cond = true;
            int vovel_c = 0;
            int vovel_row = 0;
            int conso_row = 0;
            int e_c = 0;
            int o_c = 0;

            char latest = ' ';

            for(int i = 0; i < s.length(); i++){
                if(isVowel(s.charAt(i))){
                    vovel_c++;
                    vovel_row++;
                    conso_row = 0;
                }
                else{
                    conso_row++;
                    vovel_row = 0;
                }

                if(conso_row == 3 || vovel_row == 3){
                    cond = false;
                    break;
                }
                else if( (e_c == 1 && s.charAt(i) == 'e') ||(o_c == 1 && s.charAt(i) == 'o')){

                }
                else if(latest == s.charAt(i)){
                    cond = false;
                    break;
                }

                latest = s.charAt(i);
                if(s.charAt(i) == 'e') e_c++;
                else if(s.charAt(i) == 'o') o_c++;

            }

            if(vovel_c == 0){
                cond = false;
            }



            if(cond == true){
                System.out.println("<" + s + "> is acceptable.");
            }
            else{
                System.out.println("<" + s + "> is not acceptable.");
            }



            s = in.nextLine();
        }

        in.close();

    }

    public static boolean isVowel(Character a){
        
        if(Character.toLowerCase(a) == 'a' || Character.toLowerCase(a) == 'e' || Character.toLowerCase(a) == 'i' || 
        Character.toLowerCase(a) == 'o' || Character.toLowerCase(a) == 'u'){
            return true;
        }
        else{
            return false;
        }
    }

}
