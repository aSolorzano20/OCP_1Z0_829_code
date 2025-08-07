package org.example.Polimorfismo;

public class TestClass {

    void processBase(Base base) {
        if(base instanceof A a && a instanceof AA aa ) {
            aa.mAA();
        }

        /*
        if(base instanceof B b || base instanceof A a ) {

            if(b !=null)
                System.out.println(b.power());

            if(a!=null)
                System.out.println(a.power()); }
        */
    }
}
