package ejemplo9List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Book {
    public static void main(String args[]) {
        List<String>  lBook = new ArrayList<>(Arrays.asList("La Iliada", "El Señor de los anillos", "Spotify"));
        // Using  for loop for iteration
        for (int i = 0; i < lBook.size(); i++) {
            System.out.print(lBook.get(i) + "<==> ");
        }

        // New line for better readability
        System.out.println();

        // Using for-each loop for iteration
        for (String str : lBook)
            // Printing all the elements
            // which was inside object
            System.out.println(str );

        Iterator<String> iterador = lBook.iterator();
        while(iterador.hasNext()) {
            String elemento = iterador.next();
            System.out.print(elemento + " -- ");
        }

    }
    }

