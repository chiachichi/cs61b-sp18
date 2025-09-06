public class IntList {
    /** list及其常見操作的實作，但這種list很難用 */
    public int first;
    public IntList rest;        

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }
    // by recursion
    public int size() {
        if (rest == null) return 1; // 停止條件
        return 1 + rest.size(); // 方法中呼叫自身方法
    }
    // by iteration
    public int iterativeSize() {
        int size = 0;
        IntList this_p = this;
        while (this_p != null) {
            size += 1;
            this_p = this_p.rest; // 使用rest會進入無限迴圈，使用this_p.rest才正確！
        }
        return size;
    } 
    // 輸入整數i，取得list第i個元素（忽略i為負值的情況）
    // by iteration
    public int get(int i) {
        // 拿到目標IntList
        IntList this_p = this;
        for (int j=0; j<i; j++) {
            this_p = this_p.rest;
            if (this_p == null) return -1; // -1 means Error
        }
        // 取出first
        return this_p.first;
    }
    // by recursion
    public int get(int i) {
        if (i == 0) return first;
        return this.rest.get(i-1);
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);
        System.out.println("L.size()=" + L.size());
        System.out.println("L.iterativeSize()=" + L.iterativeSize());
        System.out.println("L.get(0)=" + L.get(0));
        System.out.println("L.get(1)=" + L.get(1));
        System.out.println("L.get(2)=" + L.get(2));
        System.out.println("L.get(3)=" + L.get(3));
    }
}
