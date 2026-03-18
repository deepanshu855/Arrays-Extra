package Easy;

public class _121 {
    public static int maxProfit(int[] prices) {
        if(prices.length== 1) return 0;

        int minSoFar= prices[0];
        int ans= 0;

        for (int i=1; i<prices.length; i++){
            ans= Math.max(prices[i]-minSoFar, ans);
            minSoFar= Math.min(minSoFar, prices[i]);
        }

        return ans;
    }

    static void main(String[] args) {
        int profit= maxProfit(new int[]{7,6,4,3,1});
        System.out.println(profit);
    }
}
