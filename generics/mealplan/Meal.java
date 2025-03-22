package generics.mealplan;

public class Meal<T extends MealPlan> {
    private T mealType;

    public Meal(T mealType) {
        this.mealType = mealType;
    }

    public void prepare() {
        mealType.prepareMeal();
    }

    public T getMealType() {
        return mealType;
    }

    @Override
    public String toString() {
        return "Meal type: " + mealType.toString();
    }
}
