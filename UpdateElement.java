package com.mycompany.array;

public class UpdateElement {

    private int array[];
    private int currentPosition = -1;
    public UpdateElement(int size) {
        array = new int[size];
    }
    public boolean udateFirst(int value) {
        if (  currentPosition < array.length - 1) {
            array[0] = value;
            return true;
        } else {
            return false;
        }
    }
    public boolean udateLast(int value) {
        if (currentPosition <array.length -1 ) {
            array[currentPosition] = value;
            return true;
        } else {
            return false;
        }
    }
     public boolean udateIndex(int value,int index) {
        if (currentPosition <array.length-1 && index<=currentPosition ) {
            array[index] = value;
            return true;
        } else {
            return false;
        }
    }
}