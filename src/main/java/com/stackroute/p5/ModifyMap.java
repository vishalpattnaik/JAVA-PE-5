/*Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
Modify and return the given map as follows:*/

package com.stackroute.p5;

import java.util.HashMap;

public class ModifyMap {

    public HashMap<String, String> mapModification(HashMap<String, String> input) {

        //replace the required key values
        input.put("val2",input.get("val1"));
        input.put("val1"," ");

        return input;
    }

}
