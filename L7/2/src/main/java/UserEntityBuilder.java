public class UserEntityBuilder {
    private String id;
    private String name;
    private int age;
    private String car;

    public UserEntityBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public UserEntityBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserEntityBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserEntityBuilder setCar(String car) {
        this.car = car;
        return this;
    }

    public UserEntity createUserEntity() {
        return new UserEntity(id, name, age, car);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCar() {
        return car;
    }
}