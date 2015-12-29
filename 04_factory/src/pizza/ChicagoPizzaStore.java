package pizza;

import pizza.pizza.Pizza;
import pizza.store.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if(item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        else {
            return null;
        }
    }
}
