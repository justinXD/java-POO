package ui;

import java.util.ArrayList;
import java.util.Scanner;

import javax.print.Doc;

import model.Doctor;
import model.Patient;

public class UIMenu {

    public static final String[] MONTHS = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre" }; // final nos indica que es constante i las mayusculas
                                                                 // tambien
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu() {
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            try {
                Scanner sc = new Scanner(System.in);
                response = Integer.valueOf(sc.nextLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            switch (response) {
                case 1:
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response != 0);
    }

    private static void authUser(int userType) {
        ArrayList<Doctor> doctors = new ArrayList<>(null);
        doctors.add(new Doctor("justin", "mail@mail.com"));
        doctors.add(new Doctor("karen", "karen@mail.com"));
        doctors.add(new Doctor("anahi", "anahi@mail.com"));

        ArrayList<Patient> patients = new ArrayList(null);
        patients.add(new Patient("roberto", "roberto@mail.com"));
        patients.add(new Patient("Carlos", "carlos@mail.com"));
        patients.add(new Patient("alexis", "alexis@mail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert ypur email");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if (userType == 1) {
                for (Doctor d : doctors) {
                    if (d.getEmail().equals(email)) {
                        emailCorrect = true;
                        doctorLogged = d;
                        // showDoctorMenu();
                    }
                }
            }
            if (userType == 2) {
                for (Patient p : patients) {
                    if (p.getEmail().equals(email)) {
                        emailCorrect = true;
                        patientLogged = p;
                        showPatientMenu();
                    }
                }
            }
        } while (!emailCorrect);

    }

    static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            try {
                Scanner sc = new Scanner(System.in);
                response = Integer.valueOf(sc.nextLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            switch (response) {
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response != 0);
    }
}
