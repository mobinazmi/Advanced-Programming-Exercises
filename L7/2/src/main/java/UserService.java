import java.util.List;

public class UserService {
    private UserService(){}
    private static UserService userService=new UserService();
    public static UserService getInstance(){
        return userService;
    }
    public void save(UserEntityBuilder userEntityBuilder)throws Exception{
        try (UserRepository userRepository=new UserRepository()){
            userRepository.insert(userEntityBuilder);
        }
    }
}
