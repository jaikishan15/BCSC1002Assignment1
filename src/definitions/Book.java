/*  Created by IntelliJ IDEA.
 *  User: Jai Kishan (jaikishan15)
 *  Date: 23/08/20
 *  Time: 8:00 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String nameOfTheBook;
    private String nameOfTheAuthorOfBook;
    private String ISBNNoOFBook;

    //*
    // this method returns the name of the book
    //
    public String getNameOfTheBook() {
        return nameOfTheBook;
    }


    //*
    // this method returns the name of the author of the book
    // *
    public String getNameOfTheAuthorOfBook() {
        return nameOfTheAuthorOfBook;
    }

    //*
    // *this mehtod returns the ISBN no of the book
    // *
    public String getISBNNoOFBook() {
        return ISBNNoOFBook;
    }
}
