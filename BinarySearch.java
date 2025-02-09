package com.mycompany.array;

public class BinarySearch {

    public static void main(String[] args) {
        int array[] = new int[10];

        array[0] = 2;
        array[1] = 4;
        array[2] = 25;
        array[3] = 26;
        array[4] = 24;
        array[5] = 35;
        array[6] = 45;
        array[7] = 98;
        array[8] = 87;
        array[9] = 90;
       

        int start = 0;
        int end = array.length - 1;
        int element=98;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length ; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
   
        while (start<=end) {
            int mid=(start+end)/2;
            if(element==array[mid]){
                System.out.println(mid);
                break;
            }
            else if(element<array[mid]){
                end=mid-1;
         
            }
            else if(element>array[mid]){
                start=mid+1;
            }
            else{
                System.out.println("element is not found");
            }
                }
    }
}
