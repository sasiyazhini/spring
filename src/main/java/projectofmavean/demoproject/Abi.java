package projectofmavean.demoproject;
//THIS IS TIGHTLY  COUPLED 
class Sasi1 {
    void add(int b) {
        System.out.println("This is first class");
    }
}
class Moni1 {
    void add(int b) {
        System.out.println("This is first class");
    }
}
class Yazhu {
    private Sasi1 sai;

    Yazhu() {
        sai = new Sasi1();
    }

    public void sub() {
        System.out.println("This is second class");
        sai.add(3); 
    }
}

public class Abi {
    public static void main(String[] args) {
        Sasi1 k = new Sasi1();
        Yazhu m = new Yazhu();
        m.sub();
    }
}
