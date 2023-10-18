package PizzaToppings;

import PizzaBase.BasePizza;

public class ExtraCheese implements Toppings{

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+20;
    }
}
