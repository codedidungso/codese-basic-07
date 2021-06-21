import example_encapsulation.package_a.A;
import example_encapsulation.package_a.A2;
import example_encapsulation.package_a.A3;

/**
 * - 4 tinh chat quan trong vai lon
 * - Abstraction - abstract, interface
 * - Inheritance - extends, implements
 * - Encapsulation - public, private, protected
 * - Polymorphism - override, overload
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student(123);
        Student s4 = new Student("Nguyen Chi Thanh");

        s1.MSSV = 10;
        s2.MSSV = 20;

        s1.setMSSV(-123); // setter
        s2.setMSSV(20);
        s2.setMSSV("20");

        float x = 10;
        char c = 65; //

        s1.setMatKhau("123");
        System.out.println(s1.getMSSV()); // this = s1
        System.out.println(s2.getMSSV()); // this = s2


        System.out.println("Create A");

        A a = new A();
        a.phuongThucPublic();
        int temp = a.thuocTinhPublic;

        System.out.println("Create A2");
        A2 a2 = new A2();
        a2.phuongThucPublic();
        temp = a.thuocTinhPublic;

        System.out.println("Create A2 with int ");
        A2 a3 = new A2(2);
        A3 aa3 = new A3();
        // new A()  => Constructor A
        // new A2()  => new A(); newA2();
        // => Constructor A - Constructor A2

        System.out.println("Ep kieu");
        A aaa = new A2();
//        A2 aaa2 = (A2) new A();

    }
}

