public class FindMin {
    public static void main (String[] args) {
        int[] arr = {17,2,3,4,87,65, 1, 76};
        System.out.println(min(arr));
    }
    public static int min(int[] arr) {
        //int ans = 0; by intiating the ans as zero gives '0' output for positive vales
        int ans = arr[0];
        for (int j : arr) {
            if (j < ans) {
                ans = j;
            }
        }
        return ans;
    }
}
