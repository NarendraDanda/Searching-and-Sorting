public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {2,3,5,9,14,16,18};
        int target = 14;
        int ans = binarySearch(numbers,target);
        System.out.println(ans);
    }
    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] numbers ,int target) {
        int start =0;
        int end = numbers.length-1;
        int middle =0;

        while(start <= end) {
            // finding the middle element
            //int middle = (end + start)/2; if start+end value much greater than the java comprehension
            middle = start + (end-start)/2;

            if(numbers[middle]> target) {
                end = middle -1;
            }
            else if(numbers[middle]<target) {
                start = middle+1;
            }
            else
                return middle;
        }
        return -1;
        //return start;
        //to find the ceiling of given number.
        //ceiling is the smallest element among the elements greater than target element.
    }
}
