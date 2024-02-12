public class InfiniteSeries {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6,8,9,11,13,14,15,17,20,22,23,25,26,28,29,30};
        int target = 22;
       // int ans = infinteSeriesBS(nums,target);
        System.out.println(ans(nums,target));
    }

    static int ans(int[] nums, int target) {
        //consider box of size 2
        int start = 0;
        int end = 1;
        //condition to increase the size of the box
        while(target> nums[end]) {
            int temp = end+1;
            end = end+ (end - start + 1) * 2;
            start = temp;
        }
        return infinteSeriesBS(nums,target,start,end);
    }

    static int infinteSeriesBS(int[] nums,int target,int start,int end) {

        while(start<=end ){
            int middle = start + (end-start)/2;
            if(nums[middle]>target) {
                end = middle-1;
            }
            else if (nums[middle]<target) {
                start = middle+1;
            }
            else
                return middle;
        }
        return -1;
    }
}
