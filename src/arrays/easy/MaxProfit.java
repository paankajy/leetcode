package arrays.easy;

public class MaxProfit {
    public int method(int[] prices){
        int profit = 0;
        int buyPrice=prices[0];
        int currentProfit=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }
            else{
                currentProfit = prices[i] - buyPrice;
                profit = Math.max(currentProfit, profit);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        int [] prices = {7,1,5,3,6,4};
        //int [] prices = {7,6,4,3,1};
        System.out.println(maxProfit.method(prices));
    }
}
