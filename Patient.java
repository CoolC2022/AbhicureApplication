// Patient.java
public class Patient {
    private String name;
    private int age;
    private String gender;
    private String disease;
    private String BloodGroup;

    public Patient( String name, int age, String gender, String disease,String bloodgroup) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.disease = disease;
        this.bloodGroup = bloodGroup;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDisease() {
        return disease;
    }
     public String getBloodGroup() {
        return bloodgroup;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
    public void getPatientInfo(){
      System.out.println(name);
      System.out.println(age);
      System.out.println(gender);
      System.out.println(disease);
      System.out.println(bloodGroup);

    }
    }
}

 
