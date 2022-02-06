/*
 * MeanValueOfElements.java
 *
 * Assignment b
 *
 * Name: Kadessov Bek
 *
 * Среднее значение элементов массива
 * */

package aitu_files;

import java.util.Scanner;

public class MeanValueOfElements {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        int [] array = new int[num];
        for (int i = 0; i < num; i++)
            array[i] = inp.nextInt(); // Инициализация массива
        int sum = 0;
        for (int element : array)
            sum += element;
        double mean = sum / array.length;

        System.out.println("Среднее значение элементов массива: " + mean);
    }
}
