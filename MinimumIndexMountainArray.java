public class MinimumIndexMountainArray {
    public static void main(String[] args) {
        int[] nums = {0,2,3,5,6,4,3,2,1};
        int target = 1;
        int ans = search(nums,target);
        System.out.println(ans);
    }

   static int search(int[] nums,int target) {
        int peak = peakIndexInMountainArray(nums);
        int firstTry= binarySearch(nums,target,0,peak);
        if(firstTry !=-1) {
            return  firstTry;
        }
        //try to search in second half
        return binarySearch(nums,target,peak+1,nums.length-1);
    }
    public static int peakIndexInMountainArray(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start < end) {
            int middle = start + (end-start)/2;
            if(nums[middle]>nums[middle+1]) {
                // we are in descending part of array
                end = middle;
            }
            else{
                start = middle+1;
            }
        }
        // as loops ends at the condition of start and end becoming equal
        return start;
    }

    static int binarySearch(int[] nums,int target,int start, int end) {

        // find whether array is sorted in ascending or descending order

        boolean isAsc = nums[start] < nums[nums.length-1];

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
