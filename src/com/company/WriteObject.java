package com.company;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author alishev
 * https://www.youtube.com/watch?v=7QZ6oZ51o0U
 */
public class WriteObject {

    public static void main(String[] args) {

        Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"), new Person(3, "Tom")};


        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream ous = new ObjectOutputStream(fos);

            ous.writeObject(people);


            fos.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
