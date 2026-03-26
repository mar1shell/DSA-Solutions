class Solution {
    public double myPow(double x, int n) {
        if (x == 0) return 0;
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n == -1) return 1 / x;

        if (n % 2 == 0) {
            double temp = myPow(x, (int) n / 2);

            return temp * temp;
        }

        return x * myPow(x, n -1);
    }
}