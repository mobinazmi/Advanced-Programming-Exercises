
public class Main {
    public static void main(String[] args){
        Person person=new Person();
        person.setUsername("mobinazimi");
        person.setPass("1234");
        person.setName("Mobina");
        person.setFamily("Azimi");
        person.setAge(18);
        person.setJob("JAVA Programmer");

            System.out.println(person.getName());
            System.out.println(person.getFamily());
            System.out.println(person.getAge());
            System.out.println(person.getJob());
            System.out.println(person.getUsername());
            System.out.println(person.getPass());
        }
    }

