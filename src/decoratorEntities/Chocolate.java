package decoratorEntities;

import baseEntities.Drink;

public class Chocolate extends DrinkDecorator{

    public Chocolate(Drink drink) {
        super(drink);
        this.price = 4;
    }

    @Override
    public String getDescription() {
        return this.drink.getDescription() + " with chocolate";
    }
}
