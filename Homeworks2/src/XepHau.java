public class XepHau {
    static int n;
    static int[][] array;
    static int[] solution;
    static final int VI_TRI_TRONG = 0; // ve tim hieu
    static final int VI_TRI_CHIEM = 1; // xem final
    static final int VI_TRI_ROCK = 2; // nghia la gi

    public static void main(String[] args) {
        n = 8;
        array = new int[n][n];
        solution = new int[n];
        for (int i = 0; i < n; i++) {
            solution[i] = -1;
            for (int j = 0; j < n; j++) {
                array[i][j] = -1;
            }
        }
        inBanCo(array);
        thu_hang(0);
    }

    public static void thu_hang(int hang) {
        if (hang == n) {
//            inBanCo(array);
            return;
        } else {
            // 0. thu tung cot mot
            for (int cot = 0; cot < n; cot++) {
                if (array[hang][cot] == -1) {
                    // 1. danh dau cac vi tri chua bi chiem (-1) bang gia tri hang cua con xe
                    for (int i = 0; i < n; i++) {
                        if (array[hang][i] == -1) {
                            array[hang][i] = hang;
                        }
                        if (array[i][cot] == -1) {
                            array[i][cot] = hang;
                        }
                    }
                    solution[hang] = cot;
                    array[hang][cot] = hang;

                    // 2. try next row
                    thu_hang(hang + 1);

                    // 3. bo con xe khoi ban co`
                    solution[hang] = -1;
                    for (int i = 0; i < n; i++) {
                        if (array[hang][i] == hang) {
                            array[hang][i] = -1;
                        }

                        if (array[i][cot] == hang) {
                            array[i][cot] = -1;
                        }
                        // can them chiem vi tri duong cheo => quan hau
                    }
                    array[hang][cot] = -1;
                }
            }
        }
    }

    public static void inBanCo(int[][] array) {
        System.out.println("=============");
        for (int i = 0; i < n; i++) {
            System.out.print(solution[i] + "; ");
        }
        System.out.println("");
        for (int hang = 0; hang < n; hang++) {
            for (int cot = 0; cot < n; cot++) {
                System.out.print(array[hang][cot] + " ");

//                if (solution[hang] == cot) {
//                    System.out.print(array[hang][cot] + " ");
//                } else {
//                    System.out.print("- ");
//                }
            }
            System.out.println();
        }
    }
}

/*
- R - -
- - R - // current
- - - -
- - - -
 */

/*

thu(i){
    for: 1- < n
        do_something();
        thu(i+1);
        undo_something();
}


 */