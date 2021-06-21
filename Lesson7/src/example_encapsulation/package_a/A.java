package example_encapsulation.package_a;

public class A {
    int thuocTinhDefault;
    public int thuocTinhPublic;
    private int thuocTinhPrivate; // khong the ke thua
    protected int thuocTinhProtected;

    int x1;
    public A(){
        System.out.println("Constructor 1 A");
    }

    public A(int x){
        System.out.println("Constructor 2 A");
    }

    void phuongThucDefault(){
        System.out.println("phuongThucDefault A");
    }
    public void phuongThucPublic(){
        System.out.println("phuongThucPublic A");
    }
    private void phuongThucPrivate(){
        System.out.println("phuongThucPrivate A");
    }
    protected void phuongThucProtected(){
        System.out.println("phuongThucProtected A");
    }
}
