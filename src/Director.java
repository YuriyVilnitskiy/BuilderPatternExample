/**
 * Created by jlaba on 25.12.2016.
 */
public class Director {
    /**
     * Complex pizza making
     * Don'y thnl about details
     */
    private PizzaBuilder pizza;

    public void setPizza(PizzaBuilder pizza) {
        this.pizza = pizza;
    }

    public Pizza getPizza() {
        return pizza.getPizza();
    }

    public void constructPizza() {
        pizza.createNewPizza();
        pizza.buildCheese();
        pizza.buildOil();
        pizza.buildMeat();
        pizza.buildseasoning();
    }
}
