public class powerExponenial {
    public static double myPow(double x, int n) {
        long bf = n;
        double ans = 1.0;
        if(bf < 0){
            x = 1/x;
            bf = -bf;
        }
        while (bf > 0) {
            if(bf % 2 == 1){
                ans *= x;
            }
            x *= x; // x ^ 2;
            bf /= 2;
        }
        return ans;
    }
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;
        System.out.println(myPow(x,n));
    }
}
