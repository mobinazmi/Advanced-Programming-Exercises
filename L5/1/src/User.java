
public class User {
    private String Username;
    private String RealName;
    private String Password;
    private int Age;
    private String Address;
    private long PhoneNumber;
    private String Education;

    public User(String Username, String RealName, String Password, int Age, String Address, long PhoneNumber, String Education) {
        this.Username = Username;
        this.RealName = RealName;
        this.Password = Password;
        this.Age = Age;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
        this.Education = Education;
    }

    public User() {
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String realName) {
        RealName = realName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

}