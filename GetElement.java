package com.mycompany.array;
public class GetElement {
private int array[];
private int currentPosition=-1;
public GetElement(int size){
    array=new int[size];
}
public int getFirst(){
    if(currentPosition<array.length-1){
        return array[0];
    }
    else{
        return -1;
    }
}
 public int getLast(){
    if(currentPosition>-1){
        return array[currentPosition];
    }
    else{
        return -1;
    }
}
 public int getIndex(int index){
    if(currentPosition<array.length-1 && index<=currentPosition){
        return array[index];
    }
    else{
        return -1;
    }
}
}
