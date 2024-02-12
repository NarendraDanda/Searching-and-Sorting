
// if we don't know whether given array is ascending or descending
//then we use Agnostic Binary Search
public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] nums = {98,76,65,65,54,43,23,20,12,10,1,0,-12,-13,-14};
        int target = 1;
        int ans = binarySearch(nums,target);
        System.out.println(ans);
    }
    // return the index
    // return -1 if it does not exist

    static int binarySearch(int[] nums,int target) {
        int start =0;
        int end = nums.length-1;

        // find whether array is sorted in ascending or descending order

        boolean isAsc = nums[0] < nums[nums.length-1];

        while(start <= end) {
            // finding the middle element
            //int middle = (end + start)/2; if start+end value much greater than the java comprehension
            int middle = start + (end-start)/2;
            if (nums[middle] == target) {
                return middle;
            }
           else if(isAsc){
                if(nums[middle]> target) {
                    end = middle -1;
                }
                else if(nums[middle]<target) {
                    start = middle+1;
                }
            }
            else {
                if(nums[middle]< target) {
                    end = middle -1;
                }
                else if(nums[middle]>target) {
                    start = middle+1;
                }
            }
        }
        return -1;
    }
}
