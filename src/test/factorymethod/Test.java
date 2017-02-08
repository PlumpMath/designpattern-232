package test.factorymethod;

import test.factorymethod.factory.Bmw320Factory;
import test.factorymethod.factory.Bmw523Factory;
import test.factorymethod.factory.BmwFactory;
import test.factorymethod.product.Bmw;

public class Test
{

    public static void main(String[] args)
    {
        BmwFactory bmw320Factory = new Bmw320Factory();
        Bmw b320 = bmw320Factory.createBmw();
        b320.run();
        BmwFactory bmw523Factory = new Bmw523Factory();
        Bmw b523 = bmw523Factory.createBmw();
        b523.run();
    }

}
