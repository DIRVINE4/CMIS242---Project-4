/*
Name: Donald Irvine
Class: Enum Status.Java
Project: Project 4!
Date: 8 March 2020
 */

package com.company;

public enum Status
{
    FOR_SALE("For Sale"),
    UNDER_CONTRACT("Under Contract"),
    SOLD("Sold");

    private final String status;


    Status(String status) {
        this.status = status;
    }
}
