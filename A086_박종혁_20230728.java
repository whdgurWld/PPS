import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        String[] tmp = in.nextLine().split(" ");
        in.close();

        int start = Integer.parseInt(tmp[0]);
        int end = Integer.parseInt(tmp[1]);


        ArrayList<element> list = new ArrayList<element>();
        for(int i = start; i <= end; i++){
            list.add(new element(i, makeStr(i)));
        }

        Collections.sort(list, new Comparator<element>(){
            public int compare(element e1, element e2){
                return e1.str.compareTo(e2.str);
            }
        });
        
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i).num);
            if(i != list.size() - 1) System.out.print(" ");
            if((i + 1) % 10 == 0) System.out.println();
        }

    }

    private static class element{
		private int num;
		private String str;
		
		public element(int num, String str) {
			this.num = num;
			this.str = str;
		}

	}


    public static String makeStr(int num){
        String answer = "";

        String no = String.valueOf(num);
        for(int i = 0; i < no.length(); i++){
            if(no.charAt(i) == '0') answer+= "zero";
            else if(no.charAt(i) == '1') answer+= "one";
            else if(no.charAt(i) == '2') answer+= "two";
            else if(no.charAt(i) == '3') answer+= "three";
            else if(no.charAt(i) == '4') answer+= "four";
            else if(no.charAt(i) == '5') answer+= "five";
            else if(no.charAt(i) == '6') answer+= "six";
            else if(no.charAt(i) == '7') answer+= "seven";
            else if(no.charAt(i) == '8') answer+= "eight";
            else if(no.charAt(i) == '9') answer+= "nine";

            if(i != no.length() - 1) answer+= " ";
        }

        return answer;
    }

    

}
