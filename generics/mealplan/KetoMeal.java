package generics.mealplan;



public class KetoMeal implements MealPlan {
    @Override
    public void prepareMeal() {
        System.out.println("Preparing a Keto meal.");
    }

    @Override
    public String toString() {
        return "Keto Meal";
    }
}
