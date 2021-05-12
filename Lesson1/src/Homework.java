import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Hay nhap xau ki tu: ");
//        String a = sc.next();
//        int num = a.length();
//        char[] arr = new char[a.length()];
//
//        for (int i = 0; i < num; i++) {
//            arr[i] = a.charAt(i);
//        }
//
//        // duyet tung phan tu // 10
//        for (int i = 0; i < num; i++) {
//            int count = 0;
//            // tim xem trong mang phan tu day xuat hien bao nhieu lan
//            for (int j = 0; j < num; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//            System.out.println("" + arr[i] + ": " + count);
//        }
//
//        // 1 2 3 1 2 2 3 1 2  character: ascii 2 => 256 kys tuwj =>
//        // 100 * 100 = 10.000
//        // index: 0 1 2 3
//        // value: 0 2 3 1
//        int[] counts = new int[256]; // 0 - 256
//
//        // 100
//        for (int i = 0; i < num; i++) {
//            int index = (int) arr[i];
//            System.out.print(index+",");
//            counts[index] = counts[index] + 1;
//        }
//        // 256
//        for (int i = 0; i < 256; i++) {
//            if(counts[i]!=0){
//                System.out.println(counts[i]);
//            }
//        }

        boolean check = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao xau ki tu : ");
        String a = sc.next();
        int l = a.length();
        char[] arr = new char[l];

        for (int i = 0; i < l; i++) {
            arr[i] = a.charAt(i);
        }
        // "abccba"
        // "abccba"

        // "abcdcba"
        // "abcdcba"

        int i = 0;
        int L2 = l/2;
        boolean check_true = true;

        for (  ; i < L2; i++) {
            if(arr[i]!=arr[l-i-1]){
                break;
            }
        }

        if(check_true){
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
        int status_code = 400;

        if(status_code==400){

        } else if(status_code==401){

        } else if(status_code==404){

        } else {

        }


    }
}
