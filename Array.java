package com.mycompany.array;

public class Array {

    public static void main(String[] args) {
        AddELerment ad=new AddELerment(30);
        ad.addFirst(20);
        ad.addFirst(30);
        ad.addFirst(40);
        ad.addFirst(50);
        ad.addFirst(60);
        ad.addLast(80);
        ad.addLast(90);
        ad.addLast(100);
        ad.addLast(811);
        ad.addIndex(70, 5);
        ad.addIndex(00, 3);
        ad.printAll();
        System.out.println("Remove element");
        ad.removeIndex(5);
        ad.removeIndex(8);
        ad.printAll();
    }
}
