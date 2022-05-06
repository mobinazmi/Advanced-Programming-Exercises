public class EmployeeEntity {
    private String name;
    private String email;
    private String address;
    private String number;
    private String previousEmployer;
    private String previousPosition;
    private String education;

    public EmployeeEntity(String name, String email, String address, String number, String previousEmployer, String previousPosition, String education) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.number = number;
        this.previousEmployer = previousEmployer;
        this.previousPosition = previousPosition;
        this.education = education;
    }

    public EmployeeEntity() {

    }
}