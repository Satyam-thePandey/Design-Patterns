package PizzaToppings;

import PizzaBase.BasePizza;

public class Mushroom implements Toppings{

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+30;
    }
}
