package test.factorymethod.factory;

import test.factorymethod.product.Bmw;
import test.factorymethod.product.Bmw523;

public class Bmw523Factory implements BmwFactory
{

    @Override
    public Bmw createBmw()
    {
        return new Bmw523();
    }

}
