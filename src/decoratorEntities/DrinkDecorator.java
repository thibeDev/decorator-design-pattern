package decoratorEntities;

import baseEntities.Drink;

public abstract class DrinkDecorator extends Drink {

    protected Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }


    @Override
    public int getPrice() {
        return drink.getPrice() + this.price;
    }

    public abstract String getDescription();
}
