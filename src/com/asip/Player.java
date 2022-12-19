package com.asip;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Player {
    String name;
    BigDecimal money;
    ArrayList<Card> playerHand;

    public void printHand(){
        for(Card card : this.playerHand){
            System.out.println(card);
        }
    }

    public String toString(){
        return name +" "+money;
    }
}
