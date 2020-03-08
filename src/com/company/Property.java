package com.company;

public class Property implements ChangeableState {

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

    public String toString(String address, Integer bedrooms, Integer sqFt, Integer price, Enum status)
    {
        return "Address: " + address + "\n Square Footage: " + sqFt + "\n Bedrooms: " + bedrooms + "\n Price: " + price
                + "\n Status: " + status;
    }


}
