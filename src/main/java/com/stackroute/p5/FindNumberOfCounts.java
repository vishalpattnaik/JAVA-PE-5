/*Write a program to find the number of counts in the following String. Store the output in
Map<String,Integer> as key value pair.*/

package com.stackroute.p5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindNumberOfCounts {

    public String findCount(String str) {

        if (str == null)                //check for null value
            return "Invalid input";

        List<String> stringList = Arrays.asList(str.split("[\\W_]+"));      //split the string
        Map<String, Integer> map = new HashMap<>();

        for (String word : stringList) {

            if (map.containsKey(word)) {        //check if map contains the word

                map.replace(word, map.get(word) + 1);   //increament the value

            } else {

                map.put(word, 1);

            }
        }

        return map.toString();      //return the output

    }

}
