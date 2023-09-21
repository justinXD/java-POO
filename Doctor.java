public class Doctor {
    int id;
    String name;
    String speciality;

    // constructor
    Doctor() {
        System.out.println("Esto se manda a imprimir desde el constructor");
    }

    // methods
    public void showName() {
        System.out.println(name);
    }
}