/*Write a program to implement set interface which sorts the given randomly ordered names in
ascending order. Convert the sorted set in to an array list*/

package com.stackroute.p5;

import java.util.ArrayList;
import java.util.Collections;

public class SortTheSet {

    public static ArrayList<String> sortTheSet(String set) {

        String[] myArray = set.split(" ");
        ArrayList<String> list = new ArrayList<String>();

        for(String arr:myArray) {

            list.add(arr);

        }

        Collections.sort(list);
        return list;

    }


}
