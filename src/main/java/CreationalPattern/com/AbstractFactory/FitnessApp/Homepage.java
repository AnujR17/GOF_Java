package CreationalPattern.com.AbstractFactory.FitnessApp;

public class Homepage {
    private Goal goalFactory;
    public Homepage(Goal factory){
        this.goalFactory = factory;
    }
    public void display(){
        MealPlan mealPlan = goalFactory.createMealPlan();
        WorkoutRoutine workoutRoutine = goalFactory.createWorkoutRoutine();
        mealPlan.displayPlan();
        workoutRoutine.displayRoutine();
    }
}
