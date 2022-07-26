/**
 * @author mila
 */
public class Pizza {

    private final int size;
    private final String name;
    private Boolean cheese;
    private Boolean olive;
    private Boolean pepperoni;
    private Boolean bacon;
    private Boolean mushroom;
    private Boolean mozarella;

    private Pizza(PizzaBuilder pizzaBuilder) {
        this.size = pizzaBuilder.size;
        this.name = pizzaBuilder.name;
        this.cheese = pizzaBuilder.cheese;
        this.olive = pizzaBuilder.olive;
        this.pepperoni = pizzaBuilder.pepperoni;
        this.bacon = pizzaBuilder.bacon;
        this.mushroom = pizzaBuilder.mushroom;
        this.mozarella = pizzaBuilder.mozarella;
    }

    public static class PizzaBuilder {

        private final int size;
        private final String name;
        private Boolean cheese;
        private Boolean olive;
        private Boolean pepperoni;
        private Boolean bacon;
        private Boolean mushroom;
        private Boolean mozarella;

        public PizzaBuilder(int size, String name) {
            this.size = size;
            this.name = name;
        }

        public PizzaBuilder withOptionalCheese(Boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder withOptionalOlive(Boolean olive) {
            this.olive = olive;
            return this;
        }

        public PizzaBuilder withOptionalPepperoni(Boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public PizzaBuilder withOptionalMushroom(Boolean mushroom) {
            this.mushroom = mushroom;
            return this;
        }

        public PizzaBuilder withOptionalBacon(Boolean bacon) {
            this.bacon = bacon;
            return this;
        }

        public PizzaBuilder withOptionalMozarella(Boolean mozarella) {
            this.mozarella = mozarella;
            return this;
        }

        public Pizza buildPizza() {
            return new Pizza(this);
        }
    }
}