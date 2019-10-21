package com.spartaglobal.solid_shop;

import com.spartaglobal.solid_shop.OpenClosedPrinciple.DiscountManager;
import com.spartaglobal.solid_shop.OpenClosedPrinciple.FantasyFilmDiscount;
import com.spartaglobal.solid_shop.Students.ManageStudents;
import com.spartaglobal.solid_shop.Students.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        FantasyFilmDiscount fantasyFilmDiscount = new FantasyFilmDiscount();
//        fantasyFilmDiscount.setDiscount("20%");
//
        Student Dana = new Student("Dana", "Awua", "Java SDET");

        ManageStudents manageStudents = new ManageStudents();
        manageStudents.printName(Dana.getFirstName(), Dana.getLastName());


    }
}
