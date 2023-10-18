package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    public Doctor(String name, String email) {
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

    public void addAvailableAppointment(String date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital real san jose");
        System.out.println("Departamendo: pediatria");
        System.out.println("Especialidad: pediatria");
    }

    // clase anidada
    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public String getDate(String DATE) {
            return format.format(date);
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

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}