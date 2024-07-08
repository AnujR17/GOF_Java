package CreationalPattern.com.AbstractFactory.basicabstractfactory;

public class Main {
public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurnitureFactory();
        Chair chair = factory.CreateChair();
        Sofa sofa = factory.createSofa();
        chair.sitOn();
        sofa.lieOn();

        factory = new AntiqueFurnitureFactory();
        chair = factory.CreateChair();
        sofa = factory.createSofa();
        chair.sitOn();
        sofa.lieOn();
    }
}
