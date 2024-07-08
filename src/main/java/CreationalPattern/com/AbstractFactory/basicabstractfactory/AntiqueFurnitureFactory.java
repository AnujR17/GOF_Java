package CreationalPattern.com.AbstractFactory.basicabstractfactory;

public class AntiqueFurnitureFactory implements FurnitureFactory{

        @Override
        public Chair CreateChair() {
            return new antiqueChair();
        }
        @Override
        public Sofa createSofa() {
            return new antiqueSofa();
        }
}
