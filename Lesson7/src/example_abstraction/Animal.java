package example_abstraction;

// class Animal can
interface AnUong{
    abstract void an();
    abstract void uong();
}

// class Animal is
public abstract class Animal implements AnUong {
    int sochan;

    void phuongthuc1(){

    }
    abstract void dichuyen(int x,int y);
}

class ConLon extends Animal {

    public ConLon(){
        this.sochan = 4;
    }
    // bat buoc
    @Override
    void dichuyen(int x, int y) {
        System.out.println("Con lon di chuyen");
    }

    @Override
    public void an() {

    }

    @Override
    public void uong() {

    }
}

class ConGa extends Animal {
    public ConGa(){
        this.sochan = 2;
    }
    @Override
    void dichuyen(int x, int y) {
        System.out.println("Con ga di chuyen");
    }

    @Override
    public void an() {

    }

    @Override
    public void uong() {

    }
}

class X implements AnUong {

    @Override
    public void an() {

    }

    @Override
    public void uong() {

    }
}

class Main {
    public static void main(String[] args) {
        Animal a1;

        a1 = new ConLon();
        a1.dichuyen(1,1);

        a1 = new ConGa();
        a1.dichuyen(1,1);

        a1.an();
        a1.uong();

        X x = new X();
        x.an();

        choAn(new ConGa());
        choAn(new ConLon());
        choAn(new X());
    }

    static void choAn(AnUong t){
        t.an();
    }
}

