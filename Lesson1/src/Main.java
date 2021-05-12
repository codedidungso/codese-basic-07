import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // i < 10 : true thì thoát
            System.out.println(i);
        };
        Scanner sc = new Scanner(System.in);
        int k = 0;

        while(k != 10){ // k != 10 : false thì thoát
            System.out.println("Nhap k:");
            k = sc.nextInt();
        }

        int[] danhsach;
        int danhsach3[];

        int[] danhsach2 = {4,5,6}; // 0 1 2
        int[] danhsach4 = new int[2];

        int n;
        System.out.println("Nhap vao so phan tu: ");
        n = sc.nextInt();
        danhsach = new int[n];
        // 0 1 2
        for (int i = 0; i < danhsach.length; i++){
            System.out.println("Nhap vao phan tu thu " + (i + 1));
            danhsach[i] = sc.nextInt();
        }
        for (int i = 0; i < danhsach.length; i++){
            System.out.print(danhsach[i]);
            if(i!=danhsach.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < danhsach.length - 1; i++){
            System.out.print(danhsach[i]);
            System.out.print(",");
        }
        System.out.print(danhsach[danhsach.length-1]);

        System.out.println();
        System.out.print(danhsach[0]);
        for (int i = 1; i < danhsach.length ; i++) {
            System.out.print(",");
            System.out.print(danhsach[i]);
        }


    }
}
