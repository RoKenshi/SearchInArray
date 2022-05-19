package com.Herbert.search;

public class Search {
    public void searchFunc(int elem){
        int num[] = {6,43,7,3,6,89,4,2,46,845,79,3,456,54,8,5,23,45,72};
        boolean found = false;

        for (int x: num){
            if (x == elem){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Value found!");
        } else {
            System.out.println("Value not found!");
        }
    }
}
