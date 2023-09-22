import static ui.UIMenu.*; // asi hacemos ei import de los metodo estaticos de la clase

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Papucho";
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDoctor2 = new Doctor();
        myDoctor2.showId();

        showMenu();
    }
}