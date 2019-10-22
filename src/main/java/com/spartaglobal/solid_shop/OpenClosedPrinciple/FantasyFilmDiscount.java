package com.spartaglobal.solid_shop.OpenClosedPrinciple;

public class FantasyFilmDiscount implements IFilmDiscount {

    public void setDiscount(String discount) {

        this.discount = discount;
    }

    private String discount;


    @Override
    public String filmDiscount()
    {
        return null;
    }
}
