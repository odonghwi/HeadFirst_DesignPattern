package pizza.ingredient.factory;

import pizza.ingredient.ingredients.Cheese.Cheese;
import pizza.ingredient.ingredients.Clams.Clams;
import pizza.ingredient.ingredients.Sauce.Sauce;
import pizza.ingredient.ingredients.Veggies.Veggies;
import pizza.ingredient.ingredients.dough.Dough;
import pizza.ingredient.ingredients.pepperoni.Pepperoni;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

}
