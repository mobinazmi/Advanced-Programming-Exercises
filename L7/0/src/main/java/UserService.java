public class UserService {
    private UserService(){}
    private static UserService userService=new UserService();
    public static UserService getInstance(){
        return userService;
    }
    public void save(UserEntityBuilder userEntity)throws Exception{
        try (UserRepository userRepository=new UserRepository()){
            if (userEntity.getName()==null){
                System.out.println("Please enter your name correctly.");
            }
            if (userEntity.getUsername()==null){
                System.out.println("Please enter a valid username.");
            }
            if(userEntity.getEmail().contains("@gmail.com")){
            }else System.out.println("Please enter your email correctly!");
            userRepository.insert(userEntity);
        }
    }
}
