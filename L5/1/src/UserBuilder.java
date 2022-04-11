public class UserBuilder {
    private String username;
    private String realName;
    private String password;
    private int age;
    private String address;
    private long phoneNumber;
    private String education;

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEducation() {
        return education;
    }

    public UserBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder setRealName(String realName) {
        this.realName = realName;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder setEducation(String education) {
        this.education = education;
        return this;
    }

    public User createUser() {
        return new User(username, realName, password, age, address, phoneNumber, education);
    }
}