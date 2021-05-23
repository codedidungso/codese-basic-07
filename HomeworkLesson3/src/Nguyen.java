public class Nguyen {
    public static void main(String[] args) {
        // variable
        // function
//        KieuDuLieu tenBien

        // statement; condition; loop
        for (int i = 0; i < 10; i++) {
            i = i + 1; // i++
            System.out.println(i);
        }
        // i = 0

        // KTDK: i < 10 => True
        // in ra i ( i = 0 )
        // i++ ( i = 1 )

        // KTDK: i < 10 => True
        // in ra i ( i = 1 )
        // i++ ( i = 2 )

        // ...

        // KTDKi i < 10 ( i = 9 ) => True
        // in ra i ( i = 9 )
        // i++ ( i = 10 )

        // KTDK i < 10 => Flase
        // thoat vong lap

// if A if B if C .. A and B and C or | and or
        for (int i = 0; i < 100; i = i + 1) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("chia het cho 2 va 3: " + i);
            }
            if (i % 5 == 0 || i % 7 == 0) {
                System.out.println(" chia het cho 5 hoac 7: " + i);
            }
        }

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i = i + 1;
            break;
        }

        int ketqua;
        int x = 15;
        int y = 7;
        // cong
        ketqua = x + y; // 22
        ketqua = x - y; // 8
        ketqua = x * y; // 135

        ketqua = x / y; // 2
        ketqua = x % y; // 1

        // for i = 0 -> 100
        // neu i % 3 == 0 thi in ra i

        // [ 7, 9, 5, 0 ]
        // index : 1  2  3  4
        // index : 0  1  2  3 4 5 6 7 8 9
        // value : 7, 9, 5, 0
        // arr.length = 10
        int[] arr = new int[10];
        arr[7] = 123;
        arr[2] = 456;
        for (int index = 0; index < arr.length; index++) {
            System.out.print("index: " + index);
            System.out.println("  ==== value: " + arr[index]);
        }
        // Ctrl Alt L


    }
}
