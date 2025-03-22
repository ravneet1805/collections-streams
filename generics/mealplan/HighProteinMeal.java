package generics.mealplan;


public class HighProteinMeal implements MealPlan {
    @Override
    public void prepareMeal() {
        System.out.println("Preparing a High-Protein meal.");
    }

    @Override
    public String toString() {
        return "High-Protein Meal";
    }
}
