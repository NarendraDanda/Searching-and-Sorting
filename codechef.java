import java.util.Arrays;
import java.util.Scanner;

public class codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);

        int target = in.nextInt();

        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] ans = sum(arr, target);
        System.out.println(Arrays.toString(ans));


        }
        public static int[] sum( int[] arr, int target){
         int[] add = new int[arr.length];

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] + arr[j] == target) {
                        return new int[]{arr[i], arr[j]};
                    }

                }
            }
            return new int[]{};
        }
    }
