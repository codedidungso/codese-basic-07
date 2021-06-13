class PhanSo {
    // Access modifier: default, public, private, protected
    int tuso;
    int mauso;

}

public class Main {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo();
        ps1.tuso = 1;
        ps1.mauso = 2;
        System.out.println("PS1: " + ps1.tuso + "/" + ps1.mauso);
        PhanSo ps2 = new PhanSo();
        ps2.tuso = 3;
        ps2.mauso = 4;
        System.out.println("PS2: " + ps2.tuso + "/" + ps2.mauso);
        PhanSo ps3 = cong(ps1, ps2);
        System.out.println("PS3: " + ps3.tuso + "/" + ps3.mauso);
    }


    static PhanSo cong(PhanSo a, PhanSo b) {
        PhanSo ketqua = new PhanSo();
        ketqua.tuso = a.tuso * b.mauso + b.tuso * a.mauso;
        ketqua.mauso = a.mauso * b.mauso;
        return ketqua;
    }
}
