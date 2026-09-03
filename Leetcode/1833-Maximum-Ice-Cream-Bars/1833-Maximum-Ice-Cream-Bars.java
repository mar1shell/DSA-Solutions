class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int iceCreamCount = 0;
        Arrays.sort(costs);

        for (int cost : costs) {
            if (cost > coins) {
                break;
            }

            iceCreamCount++;
            coins -= cost;
        }

        return iceCreamCount;
    }
}
