package org.example.ControlFlow;

public class LoopsTest {

    public static void main(String[] args) {
        int c = 0;
        A: for(var i = 0; i < 2; i++){

            System.out.println("Dentro del For i: " + i);
            System.out.println();
            B: for(var j = 0; j < 2; j++){

                System.out.println("Dentro del For j: " + j);
                System.out.println();
                C: for(var k = 0; k < 3; k++){

                    System.out.println("Dentro del For C: " + c);
                    c++;
                    if(k>j) break;
                }
            }
        }
        System.out.println(c);
    }
}
