public class maximumWealth {
    public static void main(String[] args) {
        int[][] acc = {{1,2,3},{4,6,9},{6,4,19}};
        int ans = maxWealth(acc);
        System.out.println(ans);
    }

    static int maxWealth(int[][] acc) {
        int max = Integer.MIN_VALUE;

        for(int person=0; person<acc.length;person++) {
            //intialising sum inside the loop to avoid total summation

            int sum =0;
            for(int account=0; account<acc[person].length; account++) {
                sum += acc[person][account];
                }
            if(sum>max) {
                max = sum;
            }
        }return max;
    }
}
