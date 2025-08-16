
public class HelloNumbers {
    /**實作功能：依序印出數字0-9的累積和（0 1 3 6 10 15 21 28 36 45）*/
    public static void main(String[] args) {
        int x = 0;
	    int sum = 0;
        while (x < 10) {
	        sum = sum + x;
            System.out.print(sum + " ");
            x = x + 1;
        }
	    System.out.println("");
    }
}
