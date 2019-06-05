package baseEntities;

public class Espresso extends Drink{

    public Espresso(){
        this.price = 5;
    }
    @Override
    public String getDescription() {
        return "Espresso";
    }
}
