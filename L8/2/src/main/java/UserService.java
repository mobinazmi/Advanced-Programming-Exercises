public class UserService {
    private UserService(){}
    private static UserService userService=new UserService();
    public static UserService getInstance(){
        return userService;
    }
    public void edit(UserEntityBuilder userEntityBuilder) throws Exception{
        try (UserRepository userRepository=new UserRepository()){
            userRepository.update(userEntityBuilder);

        }
    }
}
