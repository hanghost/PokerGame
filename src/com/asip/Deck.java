package com.asip;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<Card>();


        for(CardColor color : CardColor.values()){
            for(CardNumber nr : CardNumber.values()){
                Card card = new Card();
                card.setNr(nr);
                card.setColor(color);
                this.cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public ArrayList<Card> dealHand() {
        //get 5 cards RANDOM
        return null;
    }

    public ArrayList<Card> dealHand(int nrOfCards) {
        //get x cards RANDOM
        return null;
    }
}
