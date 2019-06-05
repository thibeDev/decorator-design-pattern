package decoratorEntities;

import baseEntities.Drink;

public class Caramel extends DrinkDecorator{

    public Caramel(Drink drink) {
        super(drink);
        this.price = 3;
    }

    @Override
    public String getDescription() {
        return this.drink.getDescription() + " with caramel";
    }
}
