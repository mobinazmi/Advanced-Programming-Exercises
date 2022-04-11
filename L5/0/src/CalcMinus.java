public class CalcMinus extends Main implements Calculate{
    private int a;
    private int b;
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void calc(){
        setA(Integer.parseInt(array[0]));
        setB(Integer.parseInt(array[2]));
        System.out.println(getA()-getB());
    }
}
