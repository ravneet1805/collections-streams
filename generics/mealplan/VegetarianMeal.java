package generics.mealplan;



public class VegetarianMeal implements MealPlan {
    @Override
    public void prepareMeal() {
        System.out.println("Preparing a Vegetarian meal.");
    }

    @Override
    public String toString() {
        return "Vegetarian Meal";
    }
}
