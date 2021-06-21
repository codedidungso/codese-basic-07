public class Student {
    int MSSV;
    String hoVaTen;
    private String matKhau;

    // constructor
    Student(){
        System.out.println("Create a student");
        this.MSSV = 10;
    }
    Student(int MSSV){
        System.out.println("ham khoi tao voi tham so la 1 integer");
    }
    Student(String hoVaTen){
        System.out.println("ham khoi tao voi tham so la 1 string");
    }

    int getMSSV(){ // 1234 -> 20161234
        return this.MSSV + 2016000;
    }
    // Overload
    void setMSSV(int x){
        System.out.println("ham set mssv su dung input la int");
        this.MSSV = x;
    }
    // Overload
    void setMSSV(String x){
        System.out.println("ham set mssv su dung input la string");
        this.MSSV = Integer.parseInt(x);
    }
    void setMatKhau(String newMatKhau){
        this.matKhau = newMatKhau;
    }
}
