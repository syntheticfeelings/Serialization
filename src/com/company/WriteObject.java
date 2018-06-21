package com.company;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author alishev
 * https://www.youtube.com/watch?v=7QZ6oZ51o0U
 */
public class WriteObject {

    public static void main(String[] args) {

        Person[] people = {new Person(1, "Bob"),new Person(2, "Mike"), new Person(3, "Tom")};


        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream ous = new ObjectOutputStream(fos);

            ous.writeInt(people.length);

            for (Person person:people) {
                ous.writeObject(person);
            }

            fos.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
