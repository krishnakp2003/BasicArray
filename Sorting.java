package com.mycompany.array;

public class Sorting {

    private int array[];
    private int currentPosition = -1;

    public Sorting(int size) {
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

    public boolean ascendingOrder() {
        if (currentPosition < array.length - 1) {
            for (int i = 0; i <= currentPosition; i++) {
                for (int j = i; j <= currentPosition; j++) {
                    if (array[i] <= array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
    public boolean descendingOrder() {
        if (currentPosition > -1) {
            for (int i = 0; i <= currentPosition; i++) {
                for (int j = i; j <= currentPosition; j++) {
                    if (array[i] >= array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public void printArray() {
        for (int i = 0; i <= currentPosition; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        Sorting ls = new Sorting(30);

        ls.addElement(10);
        ls.addElement(60);
        ls.addElement(30);
        ls.addElement(3);
        ls.addElement(50);
        ls.addElement(34);
        ls.addElement(340);
        ls.addElement(2);
        ls.addElement(87);
        ls.addElement(50);
        ls.addElement(45);
        ls.addElement(80);

        
        ls.printArray();

    }
}
