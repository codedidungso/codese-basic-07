import model.HighSchoolStudent;
import model.Student;
import model.UniversityStudent;

import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HighSchoolStudent h1 = new HighSchoolStudent(10, "Thien", "HN");
        UniversityStudent u1 = new UniversityStudent(12, "Giang", "HN");

        ArrayList<Student> danhsach;
        danhsach = new ArrayList<>();

        danhsach.add(h1); // 0
        danhsach.add(u1); // 1
        danhsach.add(h1); // 0
        danhsach.add(u1); // 1
        danhsach.add(h1); // 0
        danhsach.add(u1); // 1

        for (int i = 0; i < danhsach.size(); i++) {
            if (danhsach.get(i).toString().toLowerCase().contains("thi")) {
                danhsach.get(i).inputInfo(); // danhsach[i]
                danhsach.get(i).showInfo(); // danhsach[i]
                System.out.println(danhsach.get(i).toString());
            }
        }

//        Connector c = new Connector();
        Xe a = Factory.createXe();

    }

}

// Single ton
class Connector {
    private static Connector instance;

    public static Connector getInstance() {
        if (instance == null) {
            instance = new Connector();
        }
        return instance;
    }

    private Connector() {

    }

    int data = 10;
}


// Factory
class Factory {
    public static Xe createXe() {
        BanhXe x1 = new BanhXe();
        CuaXe c1 = new CuaXe();
        Xe x = new Xe(x1, c1);
        return x;
    }
}

class Xe {
    BanhXe bx;
    CuaXe cx;
    public Xe(BanhXe bx, CuaXe cx) {
        this.bx = bx;
        this.cx = cx;
    }
}

class BanhXe {

}

class CuaXe {

}