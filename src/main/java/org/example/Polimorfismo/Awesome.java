package org.example.Polimorfismo;

interface AmazingInterface{
    String value = "amazing";
    void amazingMethod(String arg);
    void metodoInterface();
}

abstract class AmazingClass implements AmazingInterface{
    static String value = "awesome";
    abstract void amazingMethod(String arg1, String arg2);
    abstract void metodoClass();
}

public class Awesome extends AmazingClass implements AmazingInterface {

    public void amazingMethod(String arg1){ }
    public void amazingMethod(String arg1, String arg2){ }
    public void metodoInterface(){ }
    public void metodoClass(){}

    public static void main(String[] args){
        AmazingInterface ai = new Awesome();

        ai.amazingMethod(AmazingInterface.value);
        ai.amazingMethod(AmazingClass.value);

        // ai.amazingMethod(AmazingInterface.value, AmazingClass.value);
        ai.metodoInterface();
    }
}
