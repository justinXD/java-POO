package model;

public class Patient extends User {
    // atributes
    String bithday;
    private Double weight;
    private Double height;
    String blood;

    public Patient(String name, String email) {
        super(name, email);
    }

    public void setWeight(double weight) { // setter, tiene convension de nombre
        this.weight = weight;
    }

    public String getWeight() { // getter
        return this.weight + " Kg.";
    }

    public void setHeight(double height) { // setter, tiene convension de nombre
        this.height = height;
    }

    public String getHeight() { // getter
        return this.height + " m.";
    }

    @Override // aqui sobreescribimos el metodo toString que habiamos sobreescrito en la clase
              // User
    public String toString() {
        return super.toString() + "\nbithday: " + bithday;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial del paciente");
    }
}
