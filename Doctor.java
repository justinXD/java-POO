import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    // atributos
    // static int id; // el static nos permite hacer el autoincremental de la
    // variable sin importar la
    // instanciacion
    // int ID; una variable en mayusculas indica una constante.
    private String speciality;

    // constructor
    // Doctor() {
    // System.out.println("Esto se manda a imprimir desde el constructor");
    // }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    // sobrecarga del constructor
    Doctor(String name, String email) {
        super(name, email);
        System.out.println("Esto se manda a imprimir desde el constructor, constructor sobrecargado");
    }

    // methods
    // public void showName() {
    // System.out.println(name);
    // }

    // public void showId() {
    // System.out.println("ID Doctor: " + id);
    // }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    // clase anidada
    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}