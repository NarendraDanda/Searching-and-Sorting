public class RotataedBS {
    public static void main(String[] args) {
        int[] nums = {7,8,0,1,2,3,4,5,6};
        System.out.println(findPivot(nums));
    }
    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int middle = start + (end-start)/2;
            // 4 cases are following

            if( nums[middle]< nums[middle-1]) { //middle > start  &&
                return middle-1;
            }
            if (nums[middle] > nums[middle+1]) { //middle < end &&
                return middle;
            }
            if(nums[middle] <= nums[start]) {
                end = middle-1;
            }
            else {
                start =middle+1;
            }
        }
        return -1;
    }
}
