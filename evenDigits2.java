public class evenDigits2 {

    // code to find the number of numbers with even number of digits in given array
// arr = {12,2,3,4,345,76} , in given array 12,76 are the numbers with even number of digits
        public static void main(String[] args) {
            int[] nums = {12,32,3,5,43,6,10};
            int ans = even(nums);
            System.out.println(ans);
        }

        static int even(int[] nums) {

            int number =0;
            for(int num : nums) {
                int n = num;
                int numberOfDigits = Digits(n);
                if(numberOfDigits%2==0) {
                    number++;
                }
            }
            return number;
        }
        static int Digits(int n) {
            int count = 0;
            while(n>0) {
                n = n/10;
                count++;
            }
            return count;
        }

    }

