import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Are you 1)first time user?  2)returning user?");
        int answer1=scanner.nextInt();
        switch (answer1){
            case 1:
                System.out.println("Please enter your username and password respectively:");
                String name=scanner1.nextLine();
                String pass=scanner1.nextLine();
                System.out.println("Choose 1)2G-1000   2)4G-2000   3)10G-5000   4)25G-10000");
                int answer=scanner.nextInt();
                switch (answer){
                    case 1:
                        UserService.getInstance().save(new UserEntityBuilder().setUsername(name).setPassword(pass).setPaycheck(1000).setVolume(2));
                        break;
                    case 2:
                        UserService.getInstance().save(new UserEntityBuilder().setUsername(name).setPassword(pass).setPaycheck(2000).setVolume(4));
                        break;
                    case 3:
                        UserService.getInstance().save(new UserEntityBuilder().setUsername(name).setPassword(pass).setPaycheck(5000).setVolume(10));
                        break;
                    case 4:
                        UserService.getInstance().save(new UserEntityBuilder().setUsername(name).setPassword(pass).setPaycheck(10000).setVolume(25));
                        break;
                }
                break;
            case 2:
                System.out.println("Please enter your username and password:");
                UserService.getInstance().equals(new UserEntityBuilder().setUsername(scanner.nextLine()).setPassword(scanner.nextLine()));
                System.out.println("Choose 1)2G-1000   2)4G-2000   3)10G-5000   4)25G-10000");
                int answer2=scanner.nextInt();
                switch (answer2){
                    case 1:
                        UserService.getInstance().update(new UserEntityBuilder().setPaycheck(1000).setVolume(2));
                        break;
                    case 2:
                        UserService.getInstance().update(new UserEntityBuilder().setPaycheck(2000).setVolume(4));
                        break;
                    case 3:
                        UserService.getInstance().update(new UserEntityBuilder().setPaycheck(5000).setVolume(10));
                        break;
                    case 4:
                        UserService.getInstance().update(new UserEntityBuilder().setPaycheck(10000).setVolume(25));
                        break;
                }

        }
        try {


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
