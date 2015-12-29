package pizza.store;

import pizza.ingredient.factory.NYPizzaIngredientFactory;
import pizza.ingredient.factory.PizzaIngredientFactory;
import pizza.pizza.CheesePizza;
import pizza.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        else if(item.equals("veggie")) {
            //pizza = new V
        }

    }
}
