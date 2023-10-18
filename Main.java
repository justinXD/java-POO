import static ui.UIMenu.*; // asi hacemos ei import de los metodo estaticos de la clase

import java.util.Date;

import model.Doctor;
import model.Patient;
import model.User;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Papucho", "papucho@mail.com");
        // myDoctor.name = "Papucho";
        // myDoctor.showName();
        // myDoctor.showId();

        // Doctor myDoctor2 = new Doctor();
        // myDoctor2.showId();

        // showMenu();

        // nested classes
        myDoctor.addAvailableAppointment("20/09/2023", "3 pm");
        myDoctor.addAvailableAppointment("20/09/2023", "4 pm");
        myDoctor.addAvailableAppointment("20/09/2023", "5 pm");
        myDoctor.addAvailableAppointment("20/09/2023", "6 pm");

        for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        Patient patient = new Patient("papucho", "papucho@email.com");
        patient.setWeight(59.7);
        System.out.println(patient.getWeight());

        System.out.println(patient.toString());

        User user = new Doctor("aneudy", "a@mail.com");
        user.showDataUser();

        User user2 = new Patient("justin", "a@mail.com");
        user2.showDataUser();

    }
}