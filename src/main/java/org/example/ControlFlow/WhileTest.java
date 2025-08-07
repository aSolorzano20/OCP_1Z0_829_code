package org.example.ControlFlow;

public class WhileTest {

    int x = 5;
    int getX(){ return x; }

    public static void main(String[] args) {
        WhileTest tc = new WhileTest();
        tc.looper();
        System.out.println(tc.x);
    }

    public void looper(){
        var x = 0;
        while( (x = getX()) != 0 ){
            System.out.println("- Iniciando prueba -");
            for(int m = 10; m>=0; m--){

                x = m;
                System.out.println("m: " +m);
            }
        }

    }
}
