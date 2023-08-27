/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
//Composition in java
import java.util.*;

class Book {

    public String title;
    public String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {

    private final List<Book> books;

    Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> gettTotalBooksInLibrary() {
        return books;
    }
}

public class CompositionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book book1 = new Book("JavaBasic", "Apiwat");
        Book book2 = new Book("JavaAdvanced", "Apiwat");
        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        Library libraryRoom = new Library(books);
        List<Book> bks = libraryRoom.gettTotalBooksInLibrary();
        for (Book bk : bks) {
            System.out.println("title : " + bk.title + " and " + " Author : " + bk.author);
        }
    }

}
