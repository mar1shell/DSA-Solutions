class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] minCoins = new int[amount + 1];

        for (int i = 1; i < minCoins.length; i++) {
            minCoins[i] = amount + 1;
        }

        for (int i = 1; i < minCoins.length; i++) {
            for (int c : coins) {
                if (i >= c) {
                    minCoins[i] = Math.min(minCoins[i], minCoins[i - c] + 1);
                }
            }
        }

        return (minCoins[amount] != amount + 1) ? minCoins[amount] : -1;
    }
}