public class Searching {
    public static void main(String[] args) {
        int[] nums = {22, 23, 53, 65, 1, 2, 19, -87, 86, -53};
        int target = 67;
        int ans = linearSerch(nums, target);
        boolean ans2 = linearSerch2(nums, target);
        int ans3 = linearSerch3(nums, target);
        System.out.println(ans + " and " + ans2 + " and " + ans3);
    }
    static boolean linearSerch2(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // run for loop
        for (int element : arr) {
            // check for element at every index if it is equal to target
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }

    static int linearSerch3(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run for loop
        for (int element : arr) {
            // check for element at every index if it is equal to target
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }


    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSerch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run for loop
        for(int index =0; index < arr.length; index++) {
            // check for element at every index if it is equal to target
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
