/**
實作功能：依序印出數字0-9的累積和
執行結果：
0 1 3 6 10 15 21 28 36 45
想法：
loop1
0

loop2
0+1

loop3
0+1+2

loop4
0+1+2+3

loop n
當次累積和 = 前次累積和 + x
*/

public class CumulativeSum {
    public static void main(String[] args) {
        int x = 0;
	int sum = 0;
        while (x < 10) {
	    sum = sum + x;
            System.out.print(sum + " ");
            x = x + 1;
	System.out.println("");
        }
    }
}
