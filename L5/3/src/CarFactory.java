public class CarFactory {
    public static Car getCar(int c){
        switch (c){
            case 0:
                return new BMW();
            case 1:
                return new Benz();
            case 2:
                return new KIA();
            case 3:
                return new Honda();
            default:return new Toyota();
        }
    }
}
