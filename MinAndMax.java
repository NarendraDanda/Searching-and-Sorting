import java.util.Arrays;

public class MinAndMax {

    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, -121, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
       // int target = 12;
        int[] ans = search(arr); // format of return value {row,col}
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr) {
        int min = arr[0][0];
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < min) {
                    min = arr[row][col];
                }
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }

        }return new int[]{min, max};


    }
}