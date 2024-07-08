package CreationalPattern.com.AbstractFactory.basicabstractfactory;

public class ModernFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair CreateChair() {
        return new modernChair();
    }
    @Override
    public Sofa createSofa() {
        return new modernSofa();
    }
}
