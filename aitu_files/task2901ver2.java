package Bek.aitu_files;
import java.util.Scanner;
public class task2901ver2 {
    private static int x, y, variant;
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Print the number of rows for the first matrix: ");
         x = inp.nextInt();
        System.out.println("Print the number of columns for the first matrix: ");
         y = inp.nextInt();

        int [][]matrix1 = new int[y][x];

        System.out.println("Print matrix:");
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                    matrix1[i][j] = inp.nextInt();
            }
        }

        Matrix m = new Matrix();

        System.out.println("What do you want to do?");
        System.out.println("1) Multiply to another matrix");
        System.out.println("2) Add to another matrix");
        System.out.println("3) Multiply to coefficient");
        System.out.println("4) Print matrix");

        variant = inp.nextInt();

        if (variant == 1){
            m.matrixMultiplication(matrix1);
        }
        else if(variant == 2){
            m.adding(matrix1);
        }
        else if(variant == 3){
            m.multiplication(matrix1);
        }
        else if (variant == 4){
            m.printMatrix(matrix1);
        }

    }
}

 class Matrix{
    Scanner inp = new Scanner(System.in);
    private int row2, col2;
    Matrix(){}
    Matrix(int row2,int col2){
        this.row2 = row2;
        this.col2 = col2;
    }
    public void matrixMultiplication(int[][] matrix1) {
        boolean consistent = false;

        int row1 = matrix1[0].length;
        int col1 = matrix1.length;

        do {
            System.out.println("Use the matrix multiplication rule!");

            System.out.println("Print the number of rows for the second matrix:");
            row2 = inp.nextInt();

            System.out.println("Print the number of columns for the second matrix:");
            col2 = inp.nextInt();

            if (row1 == col2) {
                consistent = true;
            }
            else{System.out.println("Inconsistent!");}
        }
        while (!consistent);

        int [][]matrix2 = new int[row2][col2];

        System.out.println("Print matrix:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                matrix2[i][j] = inp.nextInt();
            }
        }
        int[][] answer = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++) {
                    answer[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        printMatrix(answer);
    }

    public void adding(int[][]matrix1){
        System.out.println("Print second " + matrix1[0].length + "x" + matrix1.length + " matrix");
        int [][]matrix2 = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix2[i][j] = inp.nextInt();
            }
        }

        int[][] sum = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        printMatrix(sum);
    }

    public void multiplication(int [][] matrix1){
        System.out.println("Print coefficient: ");
        int coefficient = inp.nextInt();
        int [][]answer = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1[0].length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                answer[i][j] = matrix1[i][j]*coefficient;
            }
        }
        printMatrix(answer);
    }

    static public void printMatrix(int[][]a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

