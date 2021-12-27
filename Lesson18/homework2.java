package Lesson18;

public class homework2 {
    public static void showArray(String[][] arr){
        for(int i=0; i < arr.length; i++){
            System.out.println('{');
            for(int j=0; j < arr[i].length; j++){
                System.out.println('{');
                if (j!=arr[i].length-1 || j == 0) {
                    System.out.println(arr[i][j]);
                }
                if (j!=arr[i].length-1) {
                    System.out.println(" ,");
                }
                else{
                    System.out.println('}');
                }
            }
            System.out.println('}');
        }
    }
    public static void main(String[] args) {
        String[][] arr = {{"Bek", "Kadessov"}, {"Talga", "Amirkulov"}};
        showArray(arr);
    }
}
