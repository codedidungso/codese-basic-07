import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        SinhVien sv1;
        System.out.println("BEFORE");
        sv1 = new SinhVien(1001, "Thien", "Nowwhere");
        System.out.println("AFTER");
        sv1.hienThiThongTin();

        SinhVien sv2 = new SinhVien();
        sv2.MSSV = 1002;
        sv2.name = "Dat";
        sv2.diachi = "Asgard";
        sv2.hienThiThongTin();

        SinhVien sv3 = new SinhVien();
        sv3.hienThiThongTin();

        SinhVien[] danhsachSV = new SinhVien[10];
        int[] arr = new int[5];

        for (int i = 0; i < danhsachSV.length; i++) {
            System.out.println("Nhap vao thong tin sinh vien thu i: " + i);
            danhsachSV[i] = new SinhVien();
            danhsachSV[i].nhapThongTin();
        }

        for (int i = 0; i < danhsachSV.length; i++) {
            danhsachSV[i].hienThiThongTin();
        }

    }
}

class SinhVien {
    int MSSV;
    String name;
    String diachi;

    SinhVien() {
//        System.out.println("Ham Khoi Tao khong co tham so");
        MSSV = 0;
        name = "UNDEFINED";
        diachi = "";
    }

    SinhVien(int inputMSSV, String inputName, String inputDiachi) {
//        System.out.println("Ham Khoi Tao co tham so");
        MSSV = inputMSSV;
        name = inputName;
        diachi = inputDiachi;
    }

    void hienThiThongTin() {
        System.out.println("MSSV: " + MSSV);
        System.out.println("Ten sinh vien: " + name);
        System.out.println("Dia chi: " + diachi);
        System.
    }

    void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao MSSV");
        this.MSSV = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhap vao ten");
        this.name = sc.nextLine();

        System.out.println("Nhap vao dia chi");
        this.diachi = sc.nextLine();
    }

}
