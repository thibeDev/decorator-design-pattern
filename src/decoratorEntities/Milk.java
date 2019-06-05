package decoratorEntities;

import baseEntities.Drink;

public class Milk extends DrinkDecorator{


    public Milk(Drink drink) {

        super(drink);
        this.price = 2;
    }

    @Override
    public String getDescription() {
        return this.drink.getDescription() + " with milk";
    }
}
