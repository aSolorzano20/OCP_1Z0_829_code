package org.example.Polimorfismo;

class XXX{
    public void m() throws Exception{
        throw new Exception();
    }
}

class YYY extends XXX{
    public void m(){ }

    public static void main(String[] args) {
        YYY  obj = (YYY) new XXX();
        obj.m();
    }
}

public class TestPolimorfismo2 {
}
