public class UserEntityBuilder {
    private String username;
    private String password;
    private long paycheck;
    private float volume;

    public UserEntityBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserEntityBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserEntityBuilder setPaycheck(long paycheck) {
        this.paycheck = paycheck;
        return this;
    }

    public UserEntityBuilder setVolume(float volume) {
        this.volume = volume;
        return this;
    }

    public UserEntity createUserEntity() {
        return new UserEntity(username, password, paycheck, volume);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public long getPaycheck() {
        return paycheck;
    }

    public float getVolume() {
        return volume;
    }
}