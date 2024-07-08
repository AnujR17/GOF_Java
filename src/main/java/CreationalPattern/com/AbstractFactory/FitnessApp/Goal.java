package CreationalPattern.com.AbstractFactory.FitnessApp;

public interface Goal {
    MealPlan createMealPlan();
    WorkoutRoutine createWorkoutRoutine();
}
