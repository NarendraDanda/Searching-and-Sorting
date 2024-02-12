
// find the next greatest character of given target ,
// here for given string we have to consider it as wrapped
public class SmallestGreatestChar {
    public static void main(String[] args) {
        char [] letters = {'c','d','f','h','i','j','k'};
        char target = 'j';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
    // return the index
    // return -1 if it does not exist
    static char nextGreatestLetter(char[] letters,char target) {
        int start =0;
        int end = letters.length-1;

        while(start <= end) {
            // finding the middle element
            //int middle = (end + start)/2; if start+end value much greater than the java comprehension
            int middle = start + (end-start)/2;

            if(letters[middle]> target) {
                end = middle -1;
            }
           // else if(letters[middle]<target) {
            else {
                start = middle+1;
            }

        }
        //return end;
        //to find the floor of given number
        //floor of given number is the greatest element among the elements less than target element.

        return letters[start%letters.length];
        //to find the ceiling of given number.
        //ceiling is the smallest element among the elements greater than target element.
    }
}
