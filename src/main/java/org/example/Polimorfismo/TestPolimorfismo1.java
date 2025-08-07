package org.example.Polimorfismo;

class ClasePadre1{

    public void metodo1(){
        System.out.println("Clase Padre - metodo1() ");
    }
}

public class TestPolimorfismo1 extends ClasePadre1 {

    @Override
    public void metodo1() {
        System.out.println("Clase Hija - metodo1() ");
    }

    public static void main(String[] args) {
        TestPolimorfismo1 p = new TestPolimorfismo1();
        p.metodo1();

        ClasePadre1 cp = new ClasePadre1();
        cp.metodo1();

        ClasePadre1 ch = new TestPolimorfismo1();
        ch.metodo1();
    }
}
