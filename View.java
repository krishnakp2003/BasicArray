package com.mycompany.array;


public class View {
    
private int array[];
private int currentPosition=-1;
public View(int size){
    array=new int[size];
}
public void viewFirst(){
    if(currentPosition<array.length-1){
        System.out.println(array[0]);
        
    }
}
public void viewLast(){
    if(currentPosition<array.length-1){
        System.out.println(array[currentPosition]);
        
    }
}
public void viewIndex(int index){
    if(currentPosition<array.length-1 && index<=currentPosition){
        System.out.println(array[index]);
        
    }
}
}
