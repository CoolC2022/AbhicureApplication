// Doctor.java
public class Doctor {
    private String name;
    private String Address;
    private String specialization;
    private int experience;

    public Doctor(String name,String address, String specialization, int experience) {
        this.name = name;
        this.address = address;
        this.specialization = specialization;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return Address;
    }


    public String getSpecialization() {
        return specialization;
    }

    public int getExperience() {
        return experience;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
