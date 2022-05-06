public class UserEntityBuilder {
    private String username;
    private String password;
    private String name;
    private String email;

    public UserEntityBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserEntityBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserEntityBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserEntityBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserEntity createUserEntity() {
        return new UserEntity(username, password, name, email);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}