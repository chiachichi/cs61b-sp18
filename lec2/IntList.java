public class IntList {
    /** list及其常見操作的實作，但這種list很難用 */
    public int first;
    public IntList rest;        

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }
    
    public int size() { // by recursion
        if (rest == null) return 1; // 停止條件
        return 1 + rest.size(); // 方法中呼叫自身方法
    }

    public int iterativeSize() { // by iteration
        int size = 0;
        IntList this_p = this;
        while (this_p != null) {
            size += 1;
            this_p = this_p.rest; // 使用rest會進入無限迴圈，使用this_p.rest才正確！
        }
        return size;
    } 
    // 輸入整數i，取得list第i個元素（忽略i為負值的情況）

    // public int iterativeGet(int i) { // by iteration
    //     // 拿到目標IntList
    //     IntList this_p = this;
    //     for (int j=0; j<i; j++) {
    //         this_p = this_p.rest;
    //         if (this_p == null) return -1; // -1 means Error
    //     }
    //     // 取出first
    //     return this_p.first;
    // }
    public int get(int i) { // by recursion
        if (i == 0) return first;
        return this.rest.get(i-1);
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. 
      * 即：將L的每個元素都+x並回傳，但不能改動到L */
    // public static IntList incrList(IntList L, int x) { // by iteration
    //     // 定義 newL
    //     IntList newL = null;
    //     // 迭代
    //     for (int i=L.size()-1; i>=0; i--) {
    //         // 定義 newL 的元素 = L的元素+x
    //         newL = new IntList(L.get(i)+x, newL);
    //     }
    //     return newL;
    // }

    public static IntList incrList(IntList L, int x) { // by iteration; without size(), get()
        IntList newL = new IntList(L.first+x, null); // 新的IntList
        IntList pNew = newL; // newL不能改為自己的內層，定義一個變數在newL上移動，表示欲更新部分
        IntList pOld = L.rest; // L不能改為自己的內層，定義一個變數在L上移動，表示欲更新部分

        while (pOld != null) {
            pNew.rest = new IntList(pOld.first + x, null);
            pOld = pOld.rest;
            pNew = pNew.rest;
        }
        return newL;
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. 
      * 即：將L的每個元素都+x並回傳，直接改動L */
    // public static IntList dincrList(IntList L, int x) { // by recursion
    //     // [5, [10, [15, null]]] -> [10, [15, null]] -> [15, null] -> null
    //     // 停止條件
    //     if (L == null) return L;
    //     // 遞迴呼叫自身
    //     L.first += x; // [8, [10, [15, null]]] -> [13, [15, null]] -> [18, null]
    //     L.rest = dincrList(L.rest, x);
    //     return L;
    // }

    public static IntList dincrList(IntList L, int x) { // by iteration
        // [5, [10, [15, null]]]
        IntList p = L;
        while (p != null) {
            p.first += x;
            p = p.rest;
        }
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        System.out.println(L.get(1));

        L = incrList(L, 3);
        for (int i=0; i<L.size(); i++) {
            System.out.print(L.get(i) + " ");
        }
        System.out.println();
        L = dincrList(L, 3);
        for (int i=0; i<L.size(); i++) {
            System.out.print(L.get(i) + " ");
        }
    }
}
