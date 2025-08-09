public class WindowPosSum {
  public static void windowPosSum(int[] a, int n) {
    /** 在a陣列迭代，如果a[i]是正值，替換為a[i]+...+a[i+n]，如果索引超過只取到陣列最後一個索引；否則略過*/ 
    for (int i = 0; i < a.length; i += 1){
        if (a[i] > 0){
            int sum = 0; 
            for (int j = i; j <= i+n; j += 1){ // 在 a[i]~a[i+n]迭代
                sum += a[j];
                if (j == a.length - 1) { // 最多只取到陣列最後一個索引
                    break;
                }
            }
            // 優化版：j 最大只能取到 i+n 和 a.length - 1 的最小值
            //for (int j = i; j <= Math.min(i + n, a.length - 1); j++) {
            //    sum += a[j];
            //}
            a[i] = sum;
        }
    }
  }

  public static void main(String[] args) {
    int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a, n);

    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
  }
}