package com.company;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author alishev
 * https://www.youtube.com/watch?v=7QZ6oZ51o0U
 */
public class WriteObject {

    public static void main(String[] args) {

        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream ous = new ObjectOutputStream(fos);

            ous.writeObject(person1);
            ous.writeObject(person2);

            ous.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
