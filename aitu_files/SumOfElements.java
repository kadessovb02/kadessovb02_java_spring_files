/*
* SumOfElements.java
*
* Assignment a
*
* Name: Kadessov Bek
*
* Сумма элементов массива
* */

package aitu_files;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        int [] array = new int[num];
        for (int i = 0; i < num; i++)
            array[i] = inp.nextInt();
        int sum = 0;
        for (int element : array)
            sum += element;

        System.out.println("Сумма элементов массива: " + sum);
    }
}
