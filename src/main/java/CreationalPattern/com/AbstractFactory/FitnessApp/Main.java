package CreationalPattern.com.AbstractFactory.FitnessApp;

public class Main {
    public static void main(String[] args) {
        Goal weightLossFactory = new WeightLoss();
        Homepage homepage = new Homepage(weightLossFactory);
        homepage.display();

        Goal buildMuscleFactory = new BuildMuscle();
        homepage = new Homepage(buildMuscleFactory);
        homepage.display();
    }
}
