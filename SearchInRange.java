public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,43,54,65,76,-3,-98};
        int target = 54;

        System.out.println(linearSearch(arr,target,2,6));
    }
    static int linearSearch(int[] arr,int target, int start, int end) {
        if(arr.length == 0) {
            return -1;
        }
        for(int index = start; index <=end; index++) {
            // check for if element at every index is equal to target
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        return -1;
    }
}
