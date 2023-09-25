public class Doctor {
    // atributos
    static int id; // el static nos permite hacer el autoincremental de la variable sin importar la
                   // instanciacion
    // int ID; una variable en mayusculas indica una constante.
    String name;
    String speciality;

    // constructor
    Doctor() {
        System.out.println("Esto se manda a imprimir desde el constructor");
    }

    // sobrecarga del constructor
    Doctor(String name, String speciality) {
        System.out.println("Esto se manda a imprimir desde el constructor, constructor sobrecargado");
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    // methods
    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID Doctor: " + id);
    }
}