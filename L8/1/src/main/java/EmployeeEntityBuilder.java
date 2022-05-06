public class EmployeeEntityBuilder {
    private String name;
    private String email;
    private String address;
    private String number;
    private String previousEmployer;
    private String previousPosition;
    private String education;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public String getPreviousEmployer() {
        return previousEmployer;
    }

    public String getPreviousPosition() {
        return previousPosition;
    }

    public String getEducation() {
        return education;
    }

    public EmployeeEntityBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeEntityBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public EmployeeEntityBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public EmployeeEntityBuilder setNumber(String number) {
        this.number = number;
        return this;
    }

    public EmployeeEntityBuilder setPreviousEmployer(String previousEmployer) {
        this.previousEmployer = previousEmployer;
        return this;
    }

    public EmployeeEntityBuilder setPreviousPosition(String previousPosition) {
        this.previousPosition = previousPosition;
        return this;
    }

    public EmployeeEntityBuilder setEducation(String education) {
        this.education = education;
        return this;
    }

    public EmployeeEntity createEmployeeEntity() {
        return new EmployeeEntity(name, email, address, number, previousEmployer, previousPosition, education);
    }
}