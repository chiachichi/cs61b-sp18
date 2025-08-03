public class Maximum {
    /** 取得並印出非負整數陣列中的最大值 */
    // public static int getMax(int[] array) {
    //     int max = -1; // 表示目前的最大值，必須小於陣列第一個元素
    //     int index = 0; // 表示陣列的索引，從0開始
    //     int ele; // 表示陣列元素
    //     // 使用 while 在陣列上迭代
    //     while (index <= array.length - 1) { // 控制索引不要超過範圍
    //         ele = array[index]; // 取出元素
    //         if (ele > max) { // 比較大小
    //             max = ele;
    //         }
    //         index = index + 1; // 更新索引
    //     }
    //     return max; // 回傳
    // }
    public static int getMax(int[] array) {
        int max = -1; // 表示目前的最大值，必須小於陣列第一個元素
        int ele; // 表示陣列元素
        // 使用 for 在陣列上迭代
        for (int index = 0; index < array.length; index = index + 1) {
            ele = array[index]; // 取出元素
            if (ele > max) { // 比較大小
                max = ele;
            }
        }
        return max; // 回傳
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6}; // 定義陣列
       System.out.println(getMax(numbers)); // 取得並印出最大值
    }
}