package generics.mealplan;



public class VeganMeal implements MealPlan {
    @Override
    public void prepareMeal() {
        System.out.println("Preparing a Vegan meal.");
    }

    @Override
    public String toString() {
        return "Vegan Meal";
    }
}
