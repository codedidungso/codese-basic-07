public class Main {
    //    * Bài 2: Viết 2 hàm sắp xếp mảng các số nguyên sử dụng 2 thuật toán sau:
    //    Buble sort, Insertion sort, Merge Sort, Quick Sort
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 5, 7, 4, 2, 4, 6, 9};
        // [ 2,4,1,5,7,4,2,4,6,9 ]
        // [ 9,4,1,5,7,4,2,4,6,2 ] => 2  9
        // [ 9,7,6,5,4,4,2,4,1,2 ]
        // gia su dang
        // Insertion sort
        for (int i = 0; i < arr.length - 1; i++) {
            // dang xet phan tu i
            // cac phan phan tu con lai
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        System.out.print("Mang arr sau khi sap xep insertion sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ";");
        }


        System.out.println();
        // Buble sort
        arr = new int[]{2, 4, 1, 5, 7, 4, 2, 4, 6, 9};
        // [ 2,1,4,5,,4,2,4,6,7,9 ]

        // i = so lan thuc hien viec duyet mang
        for (int i = 0; i < arr.length; i++) {
            // duyet tungn phan tu j cua mang
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("====");

        System.out.print("Mang arr sau khi sap xep buble sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ";");
        }


        String[] strArray = new String[]{"abcdg", "bacbs", "bacbs", "bacbs", "abscbas"};
        for (int i = 0; i < strArray.length; i++) {
            // duyet tungn phan tu j cua mang
            for (int j = 0; j < strArray.length - 1; j++) {
                int kc = strArray[j].compareTo(strArray[j + 1]);
                System.out.println("Vong lap" + i + " - " + j + " : " + kc);

                if (kc > 0) {
                    String temp = strArray[j];
                    strArray[j] = strArray[j + 1];
                    strArray[j + 1] = temp;
                }
//                ntucoder.net // app.codesignal.net
            }
        }

        System.out.print("Mang arr sau khi sap xep: ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + ";");
        }

        System.out.println("========");
        String strA = "Thien"; // a
        String strB = "thien"; // b
        // 'a' - 'b'

        boolean ans1 = strA.equals(strB);
        boolean ans2 = strA.equalsIgnoreCase(strB);

        int kq1 = strA.compareTo(strB);
        int kq2 = strA.compareToIgnoreCase(strB);

        System.out.println(ans1);
        System.out.println(ans2);

        System.out.println(kq1);
        System.out.println(kq2);
//
//        Bài 6: Giả sử đang ở trạng thái x giờ y phút z giây.
        int gio = 23;
        int phut = 59;
        int giay = 59;

        int tongsogiay = gio*3600 + phut*60 + giay;

        tongsogiay += 601;

        gio = (tongsogiay / 3600 ) % 24;
        phut = (tongsogiay / 60 ) % 60;
        giay = tongsogiay % 60;

        // 456 =    4 * 10*10 +  5 * 10 +  6
        // 4h5p6s = 4 * 60*60 +  5 * 60 +  6


        // Hỏi 1 giây sau giá trị của x, y, z bằng bao nhiêu.
//        giay += 1;
//
//        if (giay > 59) {
//            phut += 1;
//            giay = 0;
//        }
//
//        if (phut > 59) {
//            gio += 1;
//            phut = 0;
//        }
//
//        if (gio > 23) {
//            gio = 0;
//        }

        System.out.println(gio + ":" + phut + ":" + giay);

    }
}
