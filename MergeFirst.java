package com.mycompany.array;

public class MergeFirst {

    private int data[];
    private int currentPosition = -1;

    public MergeFirst(int size) {
        data = new int[size];
    }

    public boolean addFirst(int value) {
        if (currentPosition < data.length - 1) {
            currentPosition = currentPosition + 1;
            for (int i = currentPosition; i > 0; i--) {
                data[i] = data[i - 1];
            }

            data[0] = value;
            return true;
        } else {
            return false;
        }
    }

   

    public boolean mergeFirst(int newData[]) {
        int availabllibility = data.length - (currentPosition + 1);

        int demond = newData.length;
        if (availabllibility >= demond) {
            int lastIndex = currentPosition + demond;

            for (int i = currentPosition; i >= 0; i--) {
                data[lastIndex] = data[i];
                lastIndex--;

            }
            int index = 0;
            for (int i : newData) {
                currentPosition++;
                data[index] = i;
                index++;

            }

            return true;
        } else {
            return false;
        }

    }

    public boolean mergeIndex(int newData[], int index) {
        int availabllibility = data.length - (currentPosition + 1);

        int demond = newData.length;
        if (availabllibility >= demond) {
            int lastIndex = currentPosition + demond;

            for (int i = currentPosition; i >= index; i--) {
                data[lastIndex] = data[i];
                lastIndex--;

            }
            for (int i : newData) {
                data[index] = i;
                index++;
                currentPosition++;

            }

            return true;
        } else {
            return false;
        }

    }

    public boolean mergeLast(int newData[]) {
        int availabllibility = data.length - (currentPosition + 1);

        int demond = newData.length;
        if (availabllibility >= demond) {
            for (int i : newData) {
                currentPosition++;
                data[currentPosition] = i;
            }
            return true;
        } else {
            return false;
        }

    }
 public void printAll() {
        for (int i = 0; i <= currentPosition; i++) {
            System.out.println(data[i]);
        }
    }
    public static void main(String[] args) {
        MergeFirst mr = new MergeFirst(10);
        mr.addFirst(100);
        mr.addFirst(200);
        mr.addFirst(300);
        mr.addFirst(400);
        mr.addFirst(500);
        mr.printAll();

        System.out.println("=======================");
        int newArray[] = {10, 20, 30};
        mr.mergeFirst(newArray);
        mr.printAll();
        System.out.println("==============================");
       int newArray1[] = {20, 30, 40};
        mr.mergeIndex(newArray1,3);
        mr.printAll();
        
        System.out.println("==============================");
        int newArray2[] = {15, 25, 35};
        mr.mergeLast(newArray2);
        mr.printAll();

    }

}
