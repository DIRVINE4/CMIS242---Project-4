/*
Name: Donald Irvine
Class: Interface ChangeableState.Java
Project: Project 4!
Date: 8 March 2020
 */

package com.company;

public interface ChangeableState<T extends Enum<T>>
{
abstract void changeState(Enum T);
}
