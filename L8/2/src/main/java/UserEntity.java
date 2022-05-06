public class UserEntity {
    private String username;
    private String password;
    private String name;
    private String email;
    public UserEntity(String username,String password,String name, String email){
        this.name=name;
        this.username=username;
        this.password=password;
        this.email=email;
    }
    public UserEntity(){}
}
