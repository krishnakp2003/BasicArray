package com.mycompany.array;

public class LinearSearch {

    private int array[];
    private int currentPosition = -1;

    public LinearSearch(int size) {
        array = new int[size];

    }

    public boolean addElement(int value) {
        if (currentPosition < array.length - 1) {
            currentPosition++;
            array[currentPosition] = value;
            return true;

        } else {
            return false;
        }
    }

    public int linearSearch(int value) {
        if (currentPosition > -1 && currentPosition < array.length - 1) {

            for (int i = 0; i < currentPosition; i++) {
                if (value == array[i]) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int firstOccurance(int value) {
        for (int i = 0; i <= currentPosition; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;

    }

    public int lastOccurance(int value) {
        for (int i = currentPosition; i >= 0; i--) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch(10);

        ls.addElement(10);
        ls.addElement(20);
        ls.addElement(30);
        ls.addElement(40);
        ls.addElement(50);
        ls.addElement(60);
        System.out.println("Linear Search");
        System.out.println(ls.linearSearch(40));
        System.out.println("First occurance");
        System.out.println(ls.firstOccurance(20));
        System.out.println("Last occurance");

        System.out.println(ls.lastOccurance(50));
    }
}
