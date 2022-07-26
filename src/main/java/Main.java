/**
 * @author mila
 */
public class Main {
    public static void main(String[] args) {
        Pizza.PizzaBuilder myPizzaBuilder = new Pizza.PizzaBuilder(15, "Italiano");
        myPizzaBuilder.withOptionalOlive(true);
        myPizzaBuilder.withOptionalMozarella(true);
        Pizza myFavoritePizza = myPizzaBuilder.buildPizza();
    }
}
