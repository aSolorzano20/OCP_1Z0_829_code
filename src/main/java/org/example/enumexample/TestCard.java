package org.example.enumexample;

import java.util.Arrays;
import java.util.stream.Stream;

enum Card
{
    HEART, CLUB, SPADE, DIAMOND;

    public boolean isRed(){
        return switch(this){
            case HEART, DIAMOND -> true;
            default -> false;
        };
    }
}
public class TestCard {

    public static void main(String[] args) {

        Stream<Card> card = Arrays.stream(Card.values()).dropWhile(c->c.isRed());
        card.forEach(c -> System.out.println("Card: " + c.name()));

        Card card1 = Card.valueOf("HEART");
        System.out.println("Card1: " + card1);

        switch(card1){
            case HEART -> System.out.println("heart");
            case CLUB -> System.out.println("club");
            case SPADE -> System.out.println("spade");
            case DIAMOND -> System.out.println("diamond");
            default -> System.out.println("unknown");
        }

        String result = switch(card1){
            case HEART -> {
                System.out.println("Parametro de entrada: " + card1.name());
                yield "heart";
            }
            case CLUB -> "club";
            case SPADE -> "spade";
            case DIAMOND -> "diamond";
            default -> "unknown";
        };

        System.out.println("Result: " + result);
    }
}
