package com.spartaglobal.solid_shop.OpenClosedPrinciple;

public class DiscountManager {

   public void processDiscount (IFilmDiscountInterface iFilmDiscountInterface){
       System.out.println(iFilmDiscountInterface.filmDiscount());
   }
}
