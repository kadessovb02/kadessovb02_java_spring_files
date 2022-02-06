/*
 * MaxMinValues.java
 *
 * Assignment c
 *
 * Name: Kadessov Bek
 *
 * Максимум и минимум среди элементов массива
 * */

package aitu_files;

import java.util.Scanner;

public class MaxMinValues {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        int [] array = new int[num];
        for (int i = 0; i < num; i++)
            array[i] = inp.nextInt(); // Инициализация массива
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(min>array[i])
                min = array[i];
            if(max<array[i])
                max = array[i];
        }
        System.out.println("Максимальное значение массива: " + max);
        System.out.println("Минимальное значение массива: " + min);
    }
}
