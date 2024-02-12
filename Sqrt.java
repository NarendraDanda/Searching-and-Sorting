import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x= in.nextInt();
        int ans = mySqrt(x);
        System.out.println(ans);
    }
    public static int mySqrt(int x) {
        int start =0;
        int end = x;
        if(x==0) {
            return 0;
        }
        while(start<=end) {
            int mid = start + (end-start)/2;
            if((long)mid*mid == (long)x) {
                return mid;
            }
            else if((long)mid*mid>(long)x) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return end;

    }
}
