package generics.mealplan;

import java.util.ArrayList;
import java.util.List;

public class MealPlanGenerator {

    // ✅ Fix: Use wildcard to accept different meal types
    public static void generateMealPlan(List<? extends Meal<? extends MealPlan>> meals) {
        System.out.println("Generating meal plan...");

        for (Meal<? extends MealPlan> meal : meals) {
            meal.prepare();
        }
    }

    public static void main(String[] args) {
        // Creating different meal instances
        Meal<VegetarianMeal> vegetarianMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> highProteinMeal = new Meal<>(new HighProteinMeal());

        // Storing meals in a list
        List<Meal<? extends MealPlan>> mealPlans = new ArrayList<>();
        mealPlans.add(vegetarianMeal);
        mealPlans.add(veganMeal);
        mealPlans.add(ketoMeal);
        mealPlans.add(highProteinMeal);

        generateMealPlan(mealPlans);
    }
}
