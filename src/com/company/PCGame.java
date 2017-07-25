package com.company;

/**
 * Created by Phill360 on 24/7/17.
 */
public class PCGame extends Game{

    private String purchaseFrom;

    public PCGame(String title, genreTypes genre, ratings rating,String purchaseFrom) {
        super(title, platforms.PC, genre, rating);
        this.purchaseFrom = purchaseFrom;

    }

    public String getPurchaseFrom() {
        return purchaseFrom;
    }

    public void setPurchaseFrom(String purchaseFrom) {
        this.purchaseFrom = purchaseFrom;
    }

    public void print(){
        super.print();
        System.out.print(" the game was purcahsed from " + purchaseFrom + "\n");
    }

}
