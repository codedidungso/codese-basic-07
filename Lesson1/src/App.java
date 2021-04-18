import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b;
        System.out.println("Nhap vao a: ");
        a = scanner.nextFloat();
        System.out.println("Nhap vao b: ");
        b = scanner.nextFloat();

        if(a==0){
            System.out.println("Lỗi a bằng không");
        } else {
            float x =  -b / a; // x =5
            System.out.println("Kết quả là x = " + x);
        }
    }
}
