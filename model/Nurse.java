package model;

public class Nurse extends User {
    private String speciality;

    Nurse(String name, String email) {
        super(name, email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital real san jose");
        System.out.println("Departamendo: GyO");
        System.out.println("Especialidad: GyO");
    }
}
