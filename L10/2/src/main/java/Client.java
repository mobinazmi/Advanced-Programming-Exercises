import java.io.Serializable;

public class Client implements Serializable {
    private String food;
    private String drink;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
    public Client(){}
    public Client (String food,String drink){
        this.food=food;
        this.drink=drink;
    }
}
