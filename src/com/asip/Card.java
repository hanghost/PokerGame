package com.asip;

import java.io.File;

public class Card {
    public static final String backImagePath = "back.jpg";
    private CardNumber nr;
    private CardColor color;

    final static int heightPixel = 100;
    final static int widthPixel = 50;

    public String getCardName(){
        return nr + " of " + color;
    }

    public File getCardImage(){
        File image = new File(getCardPath());
        return image;
    }

    public String getCardPath(){
        return this.nr + ""+this.color+".png";
    }

    public void setNr(CardNumber nr) {
        this.nr = nr;
    }

    public void setColor(CardColor color) {
        this.color = color;
    }

    public CardNumber getNr() {
        return this.nr;
    }

    public CardColor getColor() {
        return this.color;
    }

    public String toString(){
        return this.getCardName();
    }
}

