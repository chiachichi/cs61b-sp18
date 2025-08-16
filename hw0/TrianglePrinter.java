public class TrianglePrinter {
    /** 根據最大星星數，印出三角形（使用迴圈）
     * 當 最大星星數 = 3，印出三角形
        *
        **
        ***
     * 當 最大星星數 = 5，印出三角形
        *
        **
        ***
        ****
        *****    
    */
    public static void drawTriangle(int max_star) {
        int num_star = 1; // 要印的星星數，從1顆開始
        while (num_star <= max_star) { // 控制要印的星星數，最多5顆
            int which_star = 1; // 目前印的星星，從第1顆開始
            while (which_star <= num_star) { // 控制目前印的星星，最多只能印到要印的星星數
                System.out.print("*");
                which_star = which_star + 1; // 更新目前印的星星
            }
            num_star = num_star + 1; // 更新要印的星星數
            System.out.println(""); // 換行
        }
    }
    public static void main(String[] args) {
        drawTriangle(10);
    }
}

/*
學習到如何拆解問題
學習表達每行程式碼的目的
學習用字精簡（註解、變數）
*/
