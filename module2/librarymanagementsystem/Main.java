package module2.librarymanagementsystem;

import java.util.Arrays;
import java.util.Comparator;

public class Main 
{
    public static void main(String[] args) 
    {
        Book[] books = {
                new Book(101, "Java", "James Gosling"),
                new Book(102, "Python", "Guido Van Rossum"),
                new Book(103, "DBMS", "Korth"),
                new Book(104, "C", "Dennis Ritchie"),
                new Book(105, "AI", "Stuart Russell")
        };

        // Linear Search
        Book book1 = Library.linearSearch(books, "DBMS");
        if (book1 != null)
            System.out.println("Linear Search Found : " + book1.title + " by " + book1.author);

        // Sort for Binary Search
        Arrays.sort(books, Comparator.comparing(b -> b.title));

        // Binary Search
        Book book2 = Library.binarySearch(books, "Java");
        if (book2 != null)
            System.out.println("Binary Search Found : " + book2.title + " by " + book2.author);
    }
}