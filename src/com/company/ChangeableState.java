package com.company;

public interface ChangeableState<T extends Enum<T>> {



abstract void changeState(Enum T);


}
