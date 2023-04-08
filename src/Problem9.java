public class Problem9 {
    public static int FindBinomialCoeff(int n, int k) {
        if(k == 0 || k == n) { // if the n or the k equals to 1, out binomcoeff equals to 1
            return 1;
        }
        return FindBinomialCoeff(n-1, k-1) + FindBinomialCoeff(n-1, k);
        // calling the func until its equal to zero, and calling it with n-1 and k-1 and so one
        // it is default formula for BinomCoeff
    }

}
