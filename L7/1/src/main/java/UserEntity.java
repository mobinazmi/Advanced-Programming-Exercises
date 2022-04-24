public class UserEntity {
    private String username;
    private String password;
    private long paycheck;
    private float volume;
    public UserEntity(String username,String password,long paycheck,float volume){
        this.username=username;
        this.password=password;
        this.paycheck=paycheck;
        this.volume=volume;
    }
    public UserEntity(){}
}
