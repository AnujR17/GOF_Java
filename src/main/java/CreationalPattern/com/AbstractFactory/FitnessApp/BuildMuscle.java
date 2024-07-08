package CreationalPattern.com.AbstractFactory.FitnessApp;

public class BuildMuscle implements Goal {

    @Override
    public MealPlan createMealPlan() {
        return new BuildMuscleMealPlan();
    }

    @Override
    public WorkoutRoutine createWorkoutRoutine() {
        return new BuildMuscleWorkoutRoutine();
    }
}
