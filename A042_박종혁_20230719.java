import java.util.Stack;

class A042 {

    public boolean backspaceCompare(String s, String t) {
        Stack<Character> h1 = new Stack<Character>();
        Stack<Character> h2 = new Stack<Character>();
        s = s.toLowerCase();
        t = t.toLowerCase();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '#') h1.add(s.charAt(i));
            else if(!h1.empty()) h1.pop();
        }
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) != '#') h2.add(t.charAt(i));
            else if(!h2.empty()) h2.pop();
        }

        return h1.equals(h2);
    }
}