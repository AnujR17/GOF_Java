package CreationalPattern.com.AbstractFactory.basicabstractfactory;

public class antiqueChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("You can sit on the antique chair");
    }
}
