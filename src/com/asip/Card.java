package com.asip;

import java.io.File;

public class Card {

    private CardNumber nr;
    private CardColor color;

    final static int heightPixel = 100;
    final static int widthPixel = 50;

    public String getCardName(){
        return nr + " of " + color;
    }

    public File getCardImage(){
        String imgName = this.nr + ""+this.color+".png";
        File image = new File(imgName);
        return image;
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
}

