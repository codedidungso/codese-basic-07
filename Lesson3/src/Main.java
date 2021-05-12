class ToaDo {
    int x;
    int y;
    String name;
}

public class Main {

    static int a = 10; // global variable

    public static void main(String[] args) {
        int a = 9; // local variable
        int b = 6;
        someHam();
        System.out.println(a);
        int cong = hamCong(a, b);
        int tru = hamTru(a, b);
        System.out.println(cong);
        System.out.println(tru);

        double tong = 10;
        double hieu = 4;
        double soLon = tinhSoLon(tong, hieu);
        double soBe = tinhSoBe(tong, hieu);

        System.out.println(soLon);
        System.out.println(soBe);

        int x = 10;
        int y = 15;
        System.out.println("x=:" + x + "   y=:" + y);
//        int temp = x;
//        x = y;
//        y = temp;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x=:" + x + "   y=:" + y);

    }

    public static double tinhSoLon(double tong, double hieu) {
        double soLon = (tong + hieu) / 2;
        return soLon;
    }

    public static double tinhSoBe(double tong, double hieu) {
//        double soBe = (tong - hieu)/2;
//        return soBe;
        return (tong - hieu) / 2;
    }

    public static int hamCong(int a, int b) {
        return a + b;
    }

    public static void someHam() {
        System.out.println(a);
        return; // break trong while for
    }

    // modifier
    public static int x = 1;

    public static int hamTru(int a, int b) {
        return a - b;
    }

    public static ToaDo getToaDo() {
        ToaDo kkk = new ToaDo();
        kkk.x = 10;
        kkk.y = 15;
        kkk.name = "thien";
        return kkk;
    }
}

