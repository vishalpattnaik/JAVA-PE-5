/*program to update specific array element by given element and empty the array list.*/

package com.stackroute.p5;

import java.util.ArrayList;

public class UpdateArrayElement {

    public ArrayList updateArray(ArrayList arrli, String element, String replacement) {

        int index = arrli.indexOf(element);         //gets index of the element to be replaced
        arrli.set(index, replacement);              //replaces the element
        ArrayList<String> res = new ArrayList<String>(arrli);       //creates a new array list for returning the result
        arrli.clear();      //emptie the original array list
        return res;

    }

}
