class Grandfather {
    public void company() {
        System.out.println("Grandfather owns a Construction Company.");
    }
}

class Father extends Grandfather {
    public void car() {
        System.out.println("Father drives a Toyota Camry.");
    }
}

class Son extends Father {
    public void laptop() {
        System.out.println("Son uses a MacBook Pro for coding.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Son son = new Son();
        son.company();
        son.car();
        son.laptop();
    }
}