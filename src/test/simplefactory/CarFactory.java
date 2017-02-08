package test.simplefactory;

/**
 * Our main class implemented using factory pattern. It instantiates a car instance only after determining its type.
 */
public class CarFactory
{
    public static Car buildCar(CarType type)
    {
        Car car = null;
        switch (type)
        {
        case SEDAN:
            car = new SedanCar();
            break;
        case SUV:
            car = new SuvCar();
            break;
        default:
            break;
        }
        return car;
    }
}
