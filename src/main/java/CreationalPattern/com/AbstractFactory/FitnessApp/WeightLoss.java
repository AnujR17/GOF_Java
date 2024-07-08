package CreationalPattern.com.AbstractFactory.FitnessApp;

public class WeightLoss implements Goal {
    @Override
    public MealPlan createMealPlan() {
        return new WeightLossMealPlan();
    }

    @Override
    public WorkoutRoutine createWorkoutRoutine() {
        return new WeightLossWorkoutRoutine();
    }
}
