import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        String hoTen;
        int namSinh;
        String gioiTinh;
        int chieuCao;
        int canNang;
        // "13\ \t  14\thiennguyen\1998\nam\175\65
        Scanner sc = new Scanner(System.in);
        // inputstream
        // "1\n2\n 3 \n 4 \n 5 \n 6 \n 7 \n "
        // [1,\n,2,\n]
        // 12 13 14 \n
        // [12,13,14,]
        // thien nguyen\n

        // outputstream

        int aa, bb;
        aa = sc.nextInt();
        bb = sc.nextInt();
        sc.nextLine();
        // fflush()
        System.out.println("Nhap vao ho ten:");
        hoTen = sc.next();

        System.out.println("Nhap vao nam sinh:");
        namSinh = sc.nextInt();

        System.out.println("Nhap vao gioi tinh");
        gioiTinh = sc.next();

        System.out.println("Nhap vao chieu cao");
        chieuCao = sc.nextInt();

        System.out.println("Nhap vao can nang");
        canNang = sc.nextInt();

        System.out.println(hoTen);
        System.out.println(namSinh);
        System.out.println(gioiTinh);
        System.out.println(chieuCao);
        System.out.println(canNang);






        double a,b,c;
        double x1,x2;



        System.out.println("Nhap vao a: ");
        a = sc.nextDouble();
        System.out.println("Nhap vao b: ");
        b = sc.nextDouble();
        System.out.println("Nhap vao c: ");
        c = sc.nextDouble();

        if(a==0){
            if(b==0){
                if(c==0){ // 0x2 + 0x + 0 = 0
                    System.out.println("PT Vo so nghiem");
                } else { // 0x2 + 0x + 3 = 0
                    System.out.println("PT Vo nghiem");
                }
            } else {
                System.out.println("PT co 1 nghiem: ");
                System.out.println(-c/b);
            }
        } else {
            double delta = b*b - 4*a*c;
            if(delta==0){
                System.out.println("Phuong trinh co nghiem kep: ");
                System.out.println(-b/2/a);
//                System.out.println(-b/(2*a));
            } else if(delta>0){
                System.out.println("PT co hai nghiem");
                x1 = (-b-Math.sqrt(delta))/(2*a);
                x2 = (-b+Math.sqrt(delta))/(2*a);
                System.out.println(x1);
                System.out.println(x2);
            } else {
                System.out.println("PT vo nghiem");
            }
        }

    }
}
