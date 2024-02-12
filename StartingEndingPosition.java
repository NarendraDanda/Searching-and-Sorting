import java.util.Arrays;

public class StartingEndingPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,8,8,10};
        int target = 8;
        int[] ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
       //int ans = StartingEnding(nums,target);
        //System.out.println(ans);
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        //check for occurrence of the target
        int start  = StartingEnding(nums,target,true);
        int end = StartingEnding(nums,target,false);
        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    static int StartingEnding(int[] nums,int target, boolean findStartIndex) {

        int ans =-1;
        int start =0;
        int end = nums.length-1;
        while(start<=end) {
            int middle = start + (end-start)/2;
            if(nums[middle] <target) {
                start = middle+1;
            }
            else if (nums[middle]>target) {
                end = middle-1;
            }
            else {
                ans = middle;
                if(findStartIndex) {
                    end = middle-1;
                }
                else {
                    start = middle+1;
                }
            }

        }
        return ans;
        // return new int[] {-1,-1};

    }
}
