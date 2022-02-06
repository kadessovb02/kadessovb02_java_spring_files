/*
 * LowerCase.java
 *
 * Assignment d
 *
 * Name: Kadessov Bek
 *
 * Cоздать метод toLowerCase для String
 * */

package aitu_files;

import java.util.Scanner;

public class LowerCase {
    void toLowerCase(String a){
        for (int i = 0; i < a.length(); i++) {
            if ('A' <= a.charAt(i) && a.charAt(i) < 'Z')
                System.out.print((char) (a.charAt(i) + 'a'-'A'));
            else
                System.out.print(a.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        LowerCase lc = new LowerCase();
        lc.toLowerCase(inp.nextLine());
    }
}
