package Lesson17;
public class homework {
    public static void main(String[] args) {
        StringBuilder st1 = new StringBuilder("hello");
        StringBuilder st2 = new StringBuilder("hello");
        homework h = new homework();
        System.out.println(h.equality(st1, st2));
    }
    public boolean equality(StringBuilder a, StringBuilder b) {
        boolean ans = true;
        if(a.length() != b.length()){
            ans = false;
        }
        else{
        for(int i = 0; i < a.length(); i++){
            if (a.charAt(i) != b.charAt(i)){
                ans = false;
                break;
            }
        }
        }
        return ans;
    }
}
