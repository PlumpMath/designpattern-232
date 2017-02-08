package test.simplefactory;

public class TestSimpleFactoryPattern
{

    public static void main(String[] args)
    {
        Car sedanCar = CarFactory.buildCar(CarType.SEDAN);
        sedanCar.run();
        Car suvCar = CarFactory.buildCar(CarType.SUV);
        suvCar.run();
    }

}
