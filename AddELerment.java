package com.mycompany.array;

public class AddELerment {
    private int array[];
    private int currentLocation = -1;
    public AddELerment(int size) {
        array = new int[size];
    }
     public void printAll() {
        for (int i = 0; i <= currentLocation; i++) {
            System.out.println(array[i]);
        }
    }
    public boolean addFirst(int value) {
        if (currentLocation < array.length - 1) {
            currentLocation++;
            for (int i = currentLocation; i>0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = value;
            return true;
        } else {
            return false;
        }
    }
    public boolean addLast(int value) {
        if (currentLocation < array.length - 1) {
            currentLocation++;
            array[currentLocation] = value;
            return true;

        } else {
            return false;
        }
    }

    public boolean addIndex(int value, int index) {
        if (currentLocation < array.length - 1 && index <= currentLocation) {
            currentLocation++;
            for (int i = currentLocation; i >index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
            return true;
        } else {
            return false;
        }
    }

   

    public boolean removeFirst() {
        if (currentLocation > -1) {
            for (int i = 0; i < currentLocation; i++) {
                array[i] = array[i + 1];
            }
            array[currentLocation] = 0;
            currentLocation--;
            return true;
        } else {
            return false;
        }
    }
    public boolean removeLast(){
        if(currentLocation>-1){
            array[currentLocation]=0;
            currentLocation--;
            return true;
        }
        else{
            return false;
        }
    }
public boolean removeIndex(int index){
    if(currentLocation>-1 && index<=currentLocation){
        for (int i = currentLocation; i <index; i++) {
            array[i]=array[i+1];
        }
        array[index]=0;
        currentLocation--;
        return true;
    }
    else{
        return false;
    }
}
    public static void main(String[] args) {
        AddELerment ad = new AddELerment(10);
        ad.addFirst(10);
        ad.addFirst(20);
        ad.printAll();
               
    }
}
