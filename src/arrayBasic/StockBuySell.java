package arrayBasic;

public class StockBuySell {

        static int maxProfit(int[] price) {
            int minPrice = price[0];
            int maxProfit = 0;

            for (int i = 0; i < price.length; i++) {
                if (price[i] < minPrice) {
                    minPrice = price[i];
                }

                int profit = price[i] - minPrice;

                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }

            return maxProfit;
        }

        public static void main(String[] args) {
            int[] price = {7, 1, 5, 3, 6, 8};

            System.out.println("Maximum Profit = " + maxProfit(price));
        }
    }
