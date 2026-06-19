class Solution {
    public int largestAltitude(int[] gain) {
        int currHeight = 0, highest = 0;

        for (int g : gain) {
            if (g < 0) {
                highest = Math.max(highest, currHeight);
            }

            currHeight += g;
        }

        return Math.max(highest, currHeight);
    }
}
