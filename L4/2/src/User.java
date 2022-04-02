public class User <first,second,third> implements Cloneable{
    public first name;
    public second family;
    public third age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}