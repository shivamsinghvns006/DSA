class Solution {
    public double myPow(double x, int n) {
        long N = n;

        if (N < 0) {
            return 1.0 / myPowHelper(x, -N);
        }
        return myPowHelper(x, N);
    }

    private double myPowHelper(double x, long n) {
 
        if (n == 0) {
            return 1.0;
        }

        double half = myPowHelper(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}