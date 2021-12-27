package Lesson13;
import java.util.*;
public class month {
    
    public static void mTOd(int m){
        switch(m) {
            case 2: System.out.println(28); break;
            case 1: 
            case 3: 
            case 4: 
            case 6:
            case 8: 
            case 12: 
            System.out.println(31); break;
            case 5: 
            case 7: 
            case 9: 
            case 10:             
            System.out.println(31); break;
            
            default: System.out.println("Error!"); break;    
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        mTOd(inp.nextInt());
        inp.close();
    }
    
}
