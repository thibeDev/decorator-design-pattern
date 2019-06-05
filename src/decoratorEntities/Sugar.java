package decoratorEntities;

import baseEntities.Drink;

public class Sugar extends DrinkDecorator{


    public Sugar(Drink drink) {

        super(drink);
        this.price = 1;
    }

    @Override
    public String getDescription() {

        return this.drink.getDescription() + " with sugar";
    }
}
