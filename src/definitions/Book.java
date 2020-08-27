/*  Created by IntelliJ IDEA.
 *  User: Jai Kishan (jaikishan15)
 *  Date: 23/08/20
 *  Time: 8:00 PM
 *  File Name : Book.java
 * */
package definitions;
import java.util.Objects;


public class Book {
    private String nameOfTheBook;
    private String nameOfTheAuthorOfBook;
    private String iSBNNoOfTheBook;

    public Book(String nameOfTheBook, String nameOfTheAuthorOfBook, String iSBNNoOfTheBook) {
        this.nameOfTheBook = "Snowdrops";
        this.nameOfTheAuthorOfBook = "A.D Miller";
        this.iSBNNoOfTheBook = "978142411960";
    }

    public Book() {
        this.nameOfTheBook = "Gulliver's  Travels";
        this.nameOfTheAuthorOfBook = "Johnathan Swift";
        this.iSBNNoOfTheBook = "453687446764";
    }

    //*
    // this method returns the name of the book
    //
    public String getNameOfTheBook() {

        return nameOfTheBook;
    }

    public void setNameOfTheBook(String nameOfTheBook) {

        this.nameOfTheBook = nameOfTheBook;
    }

    //*
    // this method returns the name of the author of the book
    // *
    public String getNameOfTheAuthorOfBook() {

        return nameOfTheAuthorOfBook;
    }

    public void setNameOfTheAuthorOfBook(String nameOfTheAuthorOfBook) {

        this.nameOfTheAuthorOfBook = nameOfTheAuthorOfBook;
    }

    //*
    // *this mehtod returns the ISBN no of the book
    // *
    public String getiSBNNoOfTheBook() {
        return iSBNNoOfTheBook;
    }

    public void setiSBNNoOfTheBook(String iSBNNoOfTheBook) {
        this.iSBNNoOfTheBook = iSBNNoOfTheBook;
    }

    //*
    // * toString() method
    // *
    public String toString() {
        return String.format("nameOfTheBook: %s, nameOfTheAuhtorOfBook: %s, iSBNNoOfTheBook: %s",
                getNameOfTheBook(), getNameOfTheAuthorOfBook(), getiSBNNoOfTheBook());
    }

    //*
    // * Equals() method
    // *
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getNameOfTheBook(), book.getNameOfTheBook()) &&
                Objects.equals(getNameOfTheAuthorOfBook(), book.getNameOfTheAuthorOfBook()) &&
                Objects.equals(getiSBNNoOfTheBook(), book.getiSBNNoOfTheBook());
    }

    //*
    // * hashcode() method
    // *
    @Override
    public int hashCode() {
        return Objects.hash(getNameOfTheBook(), getNameOfTheAuthorOfBook(), getiSBNNoOfTheBook());
    }
}
