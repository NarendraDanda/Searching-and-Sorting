public class MinimumxIndexMountainArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,5,6,4,3,2,1};
        int target = 2;
        int ans = peakIndexInMountainArray(nums,target);
        System.out.println(ans);
    }

    public static int peakIndexInMountainArray(int[] mountainArr, int target) {
        int start = 0;
        int end = mountainArr.length-1;

        while(start < end) {
            int middle = start + (end-start)/2;
            if(mountainArr[middle]>mountainArr[middle+1]) {
                // we are in descending part of array
                end = middle;
            }
            else{
                start = middle+1;
            }
        }
        // as loops ends at the condition of start and end becoming equal
        // return start;

        return binarySearch(mountainArr,start,end,target);
    }
    static int binarySearch(int[] nums,int start, int end,int target) {

        // find whether array is sorted in ascending or descending order

        boolean isAsc = nums[0] < nums[nums.length - 1];

        while (start <= end) {
            // finding the middle element
            //int middle = (end + start)/2; if start+end value much greater than the java comprehension
            int middle = start + (end - start) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (isAsc) {
                if (nums[middle] > target) {
                    end = middle - 1;
                } else if (nums[middle] < target) {
                    start = middle + 1;
                }
            } else {
                if (nums[middle] < target) {
                    end = middle - 1;
                } else if (nums[middle] > target) {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
