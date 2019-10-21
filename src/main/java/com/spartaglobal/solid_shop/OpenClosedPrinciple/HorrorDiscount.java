package com.spartaglobal.solid_shop.OpenClosedPrinciple;

public class HorrorDiscount implements IFilmDiscountInterface {


    public void setDiscount(String discount) {
        this.discount = discount;
    }

    private String discount;


    @Override
    public String filmDiscount() {
        return null;
    }
}
