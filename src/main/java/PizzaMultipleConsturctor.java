/**
 * @author mila
 */
public class PizzaMultipleConsturctor {
    private  int size;
    private  String name;
    private Boolean cheese;
    private Boolean olive;
    private Boolean pepperoni;
    private Boolean bacon;
    private Boolean mushroom;
    private Boolean mozarella;

    public PizzaMultipleConsturctor(int size) {
        this.size = size;
    }

    public PizzaMultipleConsturctor(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public PizzaMultipleConsturctor(int size, String name, Boolean cheese) {
        this.size = size;
        this.name = name;
        this.cheese = cheese;
    }

    public PizzaMultipleConsturctor(int size, String name, Boolean cheese, Boolean olive) {
        this.size = size;
        this.name = name;
        this.cheese = cheese;
        this.olive = olive;
    }

    public PizzaMultipleConsturctor(int size, String name, Boolean cheese, Boolean olive, Boolean pepperoni) {
        this.size = size;
        this.name = name;
        this.cheese = cheese;
        this.olive = olive;
        this.pepperoni = pepperoni;
    }

    public PizzaMultipleConsturctor(int size, String name, Boolean cheese, Boolean olive, Boolean pepperoni, Boolean bacon) {
        this.size = size;
        this.name = name;
        this.cheese = cheese;
        this.olive = olive;
        this.pepperoni = pepperoni;
        this.bacon = bacon;
    }

    public PizzaMultipleConsturctor(int size, String name, Boolean cheese, Boolean olive, Boolean pepperoni, Boolean bacon, Boolean mushroom) {
        this.size = size;
        this.name = name;
        this.cheese = cheese;
        this.olive = olive;
        this.pepperoni = pepperoni;
        this.bacon = bacon;
        this.mushroom = mushroom;
    }

    public PizzaMultipleConsturctor(int size, String name, Boolean cheese, Boolean olive, Boolean pepperoni, Boolean bacon, Boolean mushroom, Boolean mozarella) {
        this.size = size;
        this.name = name;
        this.cheese = cheese;
        this.olive = olive;
        this.pepperoni = pepperoni;
        this.bacon = bacon;
        this.mushroom = mushroom;
        this.mozarella = mozarella;
    }
}
