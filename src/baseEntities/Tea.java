package baseEntities;

public class Tea extends Drink {

    public Tea() {
        this.price = 3;
    }

    @Override
    public String getDescription() {
        return "Tea";
    }
}
