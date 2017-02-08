package test.factorymethod.factory;

import test.factorymethod.product.Bmw;
import test.factorymethod.product.Bmw320;

public class Bmw320Factory implements BmwFactory
{

    @Override
    public Bmw createBmw()
    {
        return new Bmw320();
    }

}
