/*
Name: Donald Irvine
Class: Property.Java
Project: Project 4!
Date: 8 March 2020
 */

package com.company;

public class Property implements ChangeableState
{
    //instance variables
    String address;
    Integer bedrooms, sqFt, price;
    Enum status;

    Property(String address, Integer bedrooms, Integer sqFt, Integer price)
    {
        this.address = address;
        this.bedrooms = bedrooms;
        this.sqFt = sqFt;
        this.price = price;

        //setting status as enum FOR_SALE
        status = Status.FOR_SALE;
    }

    @Override
    public void changeState(Enum status)
    {
       this.status = status;
    }

    public String toString()
    {
        return "Address: " + this.address + "\n" + "Square Footage: " + this.sqFt + "\n" + "Bedrooms: " + this.bedrooms + "\n" + "Price: " + this.price
                + "\n" + "Status: " + this.status + "\n" + "\n";
    }
}
