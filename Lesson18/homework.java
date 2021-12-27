package Lesson18;
public class homework {
    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 6, 3, -7, 8, 5};
        System.out.println(sorting(arr));
    }
    public static int[] sorting(int[] a) {
        for(int i = 0; i < a.length; i++) {
            int min = a[i];
            int ind = i;
            for(int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    ind = j;
                } 
                }
                if (i != ind) {
                    int temp = a[i];
                    a[i] = min;
                    a[ind] = temp;
                }
            }   
        return a;
    }
    }

