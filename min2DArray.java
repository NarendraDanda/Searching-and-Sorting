import java.util.Arrays;

public class min2DArray {

        public static void main(String[] args) {
            int[][] arr = {
                    {23, 76, 90},
                    {18,121,-3,9},
                    {78,99,34,56},
                    {18,12,10}
            };

            int ans = min(arr); // format of return value {row,col}
            System.out.println(ans);
        }

        static int min(int[][] arr) {
           //int min = arr[0][0];
            int min = Integer.MAX_VALUE;
            for(int row = 0; row< arr.length;row++) {
                for(int col =0;col<arr[row].length;col++) {
                    if(arr[row][col] < min) {
                        min = arr[row][col];

                    }
                }
            }
            return min;
        }
    }

