
public class Bai1 {
    // Viết hàm input bán kính hình tròn, trả về diện tích hình tròn.
    public static void main(String[] args) {
        double dt = hamTinhDienTich(5);
        System.out.println(dt);
        String[] ketqua = hamTachHoTen("Nguyen Duc DUC DUC DUC DUC Thien");
        for (int i = 0; i< ketqua.length;i++){
            System.out.println(ketqua[i]);
        }

        char chA = 'A';
        int intA = (int) chA;
        System.out.println("Dang int cua char A: " + intA);
        String str = "ABCD";
        char[] str2 = new char[]{'A', 'B', 'C', 'D'};
        System.out.println("Char at 2: " + str.charAt(2));
    }

    // input => ban kinh hinh tron // double
    // output => dien tich
    // S = PI * R^2
    public static double hamTinhDienTich(double R){
        if(R<0){
            throw new Error("R khong duoc nho hon 0");
        }
        return Math.PI*R*R;
    }

//    Viết hàm nhập vào 1 chuỗi họ và tên, trả về 1 mảng gồm 3 phần từ: Họ, Tên đệm, Tên.
//    Trần Đức Thị Bo => [Trần, Đức Thị, Bo]
// => input 1 string => tim index cua cac dau space. tim dau space dau tien xuat hien. tim dau spce cuoi cung xuat hien

    // input: String
    // output: String[]
    // algorithms: Nguyeenx DDwcs Van Thi Thien

    public static String[] hamTachHoTen(String hoten){
        String[] returnValues = new String[3];

        int indexOfFirstSpace = hoten.indexOf(" ");
        char ch = ' ';
        int firstIndex = -1;
        for (int i = 0; i< hoten.length(); i++){
            if(hoten.charAt(i)==ch){
                firstIndex = i;
                break;
            }
        }
//        int indexOfLastSpace = hoten.lastIndexOf(" ");
        int lastIndex = -1;
        for (int i = hoten.length()-1; i >=0; i--){
            if(hoten.charAt(i)==ch){
                lastIndex = i;
                break;
            }
        }
        System.out.println("first Index: " + firstIndex);
        System.out.println("last Index: " + lastIndex);

        String ho = "";
        String ten = "";
        String tendem = "";
        for (int i = 0; i < firstIndex; i++){
            ho = ho + hoten.charAt(i);
        }
        for (int i = lastIndex+1; i < hoten.length(); i++){
            ten = ten + hoten.charAt(i);
        }
        for (int i = firstIndex+1; i < lastIndex; i++){
            tendem = tendem + hoten.charAt(i);
        }
        returnValues[0] = ho;
        returnValues[1] = tendem;
        returnValues[2] = ten;


        return returnValues;
    }

    // cho 1 mang cac so nguyen.
    // tim chi so mang cua phan tu dau tien va cuoi cung co gia tri = 0
    /// 2 5 3 2 3 5 0 7 5 34 23 4 6 0 8 6 5 4 3 56 7 0 9 7 56 4 34

    public static void chisodaucuoi(int[] arr){

    }


}
