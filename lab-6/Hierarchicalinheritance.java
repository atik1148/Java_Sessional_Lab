class Person {
    public void displayInfo() {
        System.out.println(" I am a person — the foundation of all professions.");
    }
}

class Doctor extends Person {
    public void treat() {
        System.out
                .println(" As a Doctor, I diagnose illnesses and save lives at Chittagong Medical College Hospital.");
    }
}

class Teacher extends Person {
    public void teach() {
        System.out.println(" As a Teacher, I inspire future engineers at IIUC's CCE department.");
    }
}

class Engineer extends Person {
    public void design() {
        System.out.println(" As an Engineer, I design smart systems using Java & embedded hardware.");
    }
}

public class Hierarchicalinheritance {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("HIERARCHICAL INHERITANCE");
        Person general = new Person();
        general.displayInfo();
        System.out.println("\n Doctor:");
        Doctor dr = new Doctor();
        dr.treat();
        System.out.println("\n Teacher:");
        Teacher prof = new Teacher();
        prof.teach();
        System.out.println("\n Engineer:");
        Engineer eng = new Engineer();
        eng.design();
    }
}
