package ejemplo8List;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public static void main(String args[])
    {
        // Creating an object of List interface,
        // implemented by ArrayList class
        List<String> al = new ArrayList<>();

        // Adding elements to object of List interface
        al.add("Juliana");
        al.add("Valeria");
        al.add("Li");

        // Checking if element is present using contains() method
        boolean isPresent = al.contains("Li");

        // Printing the result
        System.out.println("Is Li present in the list? " + isPresent);
    }
}
