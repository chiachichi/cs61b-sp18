public class Fib {
    /** Takes in a non-negative integer n, returns nth fibonacci number.
     * @param n non-negative integer
     * fibonacci seq: 0 1 1 2 3 5 8 13 21 ...
     * fib(0) = 0
     * fib(1) = 1
     * fib(n) = fib(n-1) + fib(n-2), n>=2
     */
    // // recursive method：簡潔易理解，但時間複雜度高 O(2^n)；空間複雜度 **O(n)**
    // public static int fib(int n) {
    //     if (n<2) return n;
    //     return fib(n-1) + fib(n-2);
    // }
    // iterate method：高效，時間複雜度 O(n)；空間複雜度 O(1)
    public static int fib(int n) { 
        if (n < 2) return n; // 直接定義
        // 迴圈
        int p2 = 0, p1 = 1, temp;
        for (int i=3; i<=n; i+=1) { // i -> 產出 ith fib number
            temp = p1;
            p1 = p2 + p1;
            p2 = temp;
        } // 得到(n-2)th and (n-1)th fib number
        return p2 + p1;
    }
    // // array method：時間複雜度 O(n)；空間複雜度 O(n)
    // public static int fib(int n) {
    //     int[] fib_seq = new int[n+1];
    //     fib_seq[0] = 0;
    //     // 需要才建立
    //     if (n > 0) fib_seq[1] = 1;
    //     for (int i = 2; i <= n; i += 1){ // i -> 產出 ith fib number
    //         fib_seq[i] = fib_seq[i-1] + fib_seq[i-2];
    //     }
    //     return fib_seq[n];
    // }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(fib(n));
    }

}