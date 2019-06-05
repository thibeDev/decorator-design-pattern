package baseEntities;

public abstract class Drink {

    protected int price;

     public abstract String getDescription();

     public int getPrice(){
         return price;
     }
}
