package com.stackroute.p5;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

    public int compare(Student ob1, Student ob2) {

        //do the comparing according to age, name and ID
        if(ob1.getAge() == ob2.getAge()) {

            if (ob1.getName().compareTo(ob2.getName()) == 0) {

               if(ob1.getId()==ob2.getId())
                   return 1;
               else
                   return 0;
            }

            else {
                return ob1.getName().compareTo(ob2.getName());
            }

        }

        else if(ob1.getAge() > ob2.getAge())
            return 1;

        else
            return -1;

    }

}
