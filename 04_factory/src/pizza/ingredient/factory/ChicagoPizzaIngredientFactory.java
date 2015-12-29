package pizza.ingredient.factory;

import pizza.ingredient.ingredients.Cheese.Cheese;
import pizza.ingredient.ingredients.Cheese.MozzarellaCheese;
import pizza.ingredient.ingredients.Clams.Clams;
import pizza.ingredient.ingredients.Clams.FrozenClams;
import pizza.ingredient.ingredients.Sauce.PlumTomatoSauce;
import pizza.ingredient.ingredients.Sauce.Sauce;
import pizza.ingredient.ingredients.Veggies.BlackOlives;
import pizza.ingredient.ingredients.Veggies.EggPlant;
import pizza.ingredient.ingredients.Veggies.Spinach;
import pizza.ingredient.ingredients.Veggies.Veggies;
import pizza.ingredient.ingredients.dough.Dough;
import pizza.ingredient.ingredients.dough.ThickCrustDough;
import pizza.ingredient.ingredients.pepperoni.Pepperoni;
import pizza.ingredient.ingredients.pepperoni.SlicedPepperoni;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(), new Spinach(), new EggPlant() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
