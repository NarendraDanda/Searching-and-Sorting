public class MountainArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,5,6,4,3,1};
        int ans = peakIndexInMountainArray(nums);
        System.out.println(ans);
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
}
