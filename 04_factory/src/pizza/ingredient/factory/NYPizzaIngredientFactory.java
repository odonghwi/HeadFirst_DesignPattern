package pizza.ingredient.factory;

import pizza.ingredient.ingredients.Cheese.Cheese;
import pizza.ingredient.ingredients.Cheese.ReggianoCheese;
import pizza.ingredient.ingredients.Clams.Clams;
import pizza.ingredient.ingredients.Clams.FreshClams;
import pizza.ingredient.ingredients.Sauce.MarinaraSauce;
import pizza.ingredient.ingredients.Sauce.Sauce;
import pizza.ingredient.ingredients.Veggies.*;
import pizza.ingredient.ingredients.dough.Dough;
import pizza.ingredient.ingredients.dough.ThinCrustDough;
import pizza.ingredient.ingredients.pepperoni.Pepperoni;
import pizza.ingredient.ingredients.pepperoni.SlicedPepperoni;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
