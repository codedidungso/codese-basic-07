import java.util.Date;

public class Homeworks2 {
    public static void main(String[] args) {
        System.out.println("Homeworks2");
        bai1();
        bai2();
        System.out.println("===== Fibonanci =====");
        int n = 10000000;
//        System.out.println(fibonanci(n));
        long times1 = new Date().getTime(); // start time
        System.out.println(fibonanciKDQ(n));
        long timee1 = new Date().getTime(); // end time
        System.out.println(timee1 - times1); // execute time

        long times2 = new Date().getTime(); // start time
        System.out.println(fibonanciKDQ2(n));
        long timee2 = new Date().getTime(); // end time
        System.out.println(timee2 - times2); // excute time


    }
//    * Bài 2: Giả sử ban đầu có 2 con thỏ con.
//    Thỏ con cần 1 tháng để trưởng thành.
//    Sau đó mỗi 2 tháng thì 2 con thỏ sẽ đẻ ra 2 con thỏ con.
//    Hỏi số thỏ sau n tháng với n nhập từ bàn phím.
    public static void bai1(){
        int soThoCon = 1;
        int soThoDe = 0;
        int soThoNghi = 0;
        for (int i = 0; i < 15; i++) {
            System.out.println("Thang hien tai " + i + " : ");
            System.out.println("Tho con : " + soThoCon);
            // cach hieu thu 1 - sinh ra day 2^n
//            int soThoConThangSau = soThoDe;
//            int soThoDeThangSau = soThoNghi + soThoCon;
//            int soThoNghiThangSau = soThoDe;

            // cach hieu thu 2 - sinh ra day fibonanci
            int soThoDeThangSau = soThoNghi + soThoCon;
            int soThoNghiThangSau = soThoDe;
            int soThoConThangSau = soThoDeThangSau;

            soThoCon = soThoConThangSau;
            soThoDe = soThoDeThangSau;
            soThoNghi = soThoNghiThangSau;
        }
        // f(t) = f(t-1)*2 - 1
        // f(1) = 5
        // tinh f(17)

    }

//    * Bài 3: Có 15 ô liên tiếp.
//    Ô đầu đặt 1 hạt thóc, các ô sau đó đặt gấp đôi số hạt thóc ở ô trước.
//    Hỏi cần bao nhiêu hạt thóc o o so 10.
    public static void bai2(){
        int sohatthoc = 10;
        System.out.println("Ket qua la : " + Math.pow(2,9));
        System.out.println("Ngau nhien 1 gia tri trong khoang a, b:");
        double a = 10.5;
        double b = 20.5;
        // b-a = 10
        // Math.random = [0,1)
        // b - [0,10) = [10.5,20.5)
        // [0,10) + a = [10.5, 20.5 )
        System.out.println(Math.floor( b - Math.random() * (b-a) ));

    }

    public static int sohatthoc(int n){
        if(n==1) return 1;
        return 2*sohatthoc(n-1);
    }

    public static int fibonanci(int n){
        System.out.println("Tinh gia tri fibonanci thu " + n);
        if(n==1 || n==2 ) return 1;
        return fibonanci(n-1)+fibonanci(n-2);
    }

    public static int fibonanciKDQ(int n){
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        return array[n-1];
    }

    public static int fibonanciKDQ2(int n){
        int so1 = 1;
        int so2 = 1;
        int somoi = 0;
        for (int i = 2; i < n; i++) {
            somoi = so1 + so2;
            so1 = so2;
            so2 = somoi;
        }
        return somoi;
    }


//    * Bài 4: Cho bàn cờ vua 4x4.
//    Đặt 4 con hậu vào bàn cờ sao cho không con hậu nào nằm trong nước đi của con hậu khác.
//    Nâng cao: Tổng quát n con hậu.
    static int n = 8;
    static String[][] array = new String[n][n];

    public static void xephau4x4(int n){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "-";
            }
        }
        // khoi tao ban co
        while(true){
            int count = 0;
            for (int hang = 0; hang < array.length; hang++) {
                for (int cot = 0; cot < array[hang].length; cot++) {
                    if(array[hang][cot].equals("-")){
                        count++;
                        for (int i = 0; i < array.length; i++) {
                            array[hang][i] = "x";
                            array[i][cot] = "x";
                        }
                        array[hang][cot] = "R";
                        break;
                    }
                }
            }
            if(count==n) {
                inBanCo(array);
            }
        }
    }

    public static void inBanCo(String[][] quanCo){
        System.out.println("==================================");
        for (int i = 0; i < quanCo.length; i++) {
            for (int j = 0; j < quanCo[i].length; j++) {
                System.out.print(quanCo[i][j] + " ");
            }
            System.out.println();
        }
    }

}
