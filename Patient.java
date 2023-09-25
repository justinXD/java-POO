public class Patient {
    // atributes
    int id;
    private String name;
    String email;
    String address;
    String phoneNumber;
    String bithday;
    private Double weight;
    private Double height;
    String blood;

    Patient(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setWeight(double weight) {  // setter, tiene convension de nombre
        this.weight = weight;
    }

    public String getWeight() { // getter
        return this.weight + " Kg.";
    }

    public void setHeight(double height) {  // setter, tiene convension de nombre
        this.height = height;
    }

    public String getHeight() { // getter
        return this.height + " m.";
    }
}
