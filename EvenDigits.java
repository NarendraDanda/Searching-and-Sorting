
// code to find the number of numbers with even number of digits in given array
// arr = {12,2,3,4,345,76} , in given array 12,76 are the numbers with even number of digits
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {544,12,32,3,5,544,543,60,10};
        int ans = even(nums);
        System.out.println(ans);
    }

    static int even(int[] nums) {

        int number =0;
        for(int num : nums) {
            int n = num;
            int count = 0;
            while(n>0) {
                n = n/10;
                count++;
            }
            if(count%2==0) {
                number++;
            }
        }
        return number;
    }

}
