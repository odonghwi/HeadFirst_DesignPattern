package pizza;

import pizza.pizza.Pizza;
import pizza.store.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if(item.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        else {
            return null;
        }
    }
}
