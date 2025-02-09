package com.mycompany.array;

public class RemoveElement {

    private int array[];
    private int currentPosition = -1;

    public RemoveElement(int size) {
        this.array = new int[size];
    }

    public boolean removeFirst() {
        if (currentPosition > -1) {
            for (int i = 0; i < currentPosition; i++) {
                array[i] = array[i + 1];
            }
            array[currentPosition] = 0;
            currentPosition--;
            return true;
        } else {
            return false;
        }
    }
    public boolean removeLast(){
        if(currentPosition>-1){
            array[currentPosition]=0;
            currentPosition--;
            return true;
        }
        else{
            return false;
        }
    }
public boolean removeIndex(int index){
    if(currentPosition>-1 && index<=currentPosition){
        for (int i = index; i <=currentPosition; i++) {
            array[i]=array[i+1];
        }
        array[index]=0;
        currentPosition--;
        return true;
    }
    else{
        return false;
    }
}
}
