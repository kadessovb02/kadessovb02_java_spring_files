/*
 * Fibonacci.java
 *
 * Assignment e
 *
 * Name: Kadessov Bek
 *
 * Числа Фиббоначи
 *
 *  */
package aitu_files;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(b);
        for(int i = 0; i < 14; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}