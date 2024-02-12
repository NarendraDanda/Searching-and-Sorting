public class Ceiling {
    public static void main(String[] args) {
        int[] nums = {2,3,5,9,14,16,18};
        int target = 10;
        int ans = binarySearch(nums,target);
        System.out.println(ans);
    }
    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] nums,int target) {

        if(target > nums[nums.length-1]){
            return -1;
        }
        int start =0;
        int end = nums.length-1;

        while(start <= end) {
            // finding the middle element
            //int middle = (end + start)/2; if start+end value much greater than the java comprehension
            int middle = start + (end-start)/2;

            if(nums[middle]> target) {
                end = middle -1;
            }
            else if(nums[middle]<target) {
                start = middle+1;
            }
            else
               return middle;
                //return start;
        }
        //return nums[end];
        return nums[start];
        //to find the floor of given number
        //floor of given number is the greatest element among the elements less than target element.


        //to find the ceiling of given number.
        //ceiling is the smallest element among the elements greater than target element.
    }
}

