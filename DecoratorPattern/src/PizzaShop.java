import PizzaBase.BasePizza;
import PizzaBase.FarmFrenzy;
import PizzaBase.VegDelight;
import PizzaToppings.ExtraCheese;
import PizzaToppings.Mushroom;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PizzaShop {
    public static void main(String[] args) {
        BasePizza base = new VegDelight();
        System.out.println(base.cost());

        BasePizza customPizza = new ExtraCheese(new Mushroom(new FarmFrenzy()));
        System.out.println(customPizza.cost());
    }
}