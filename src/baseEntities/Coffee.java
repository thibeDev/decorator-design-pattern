package baseEntities;

public class Coffee extends Drink {

    public Coffee() {
        this.price = 4;
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }
}
