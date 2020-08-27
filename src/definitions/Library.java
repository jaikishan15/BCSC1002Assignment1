/*  Created by IntelliJ IDEA.
 *  User: Jai Kishan (jaikishan15)
 *  Date: 23/08/20
 *  Time: 8:00 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] booksCurrentlyAvailable;

    public Library() {
        this.booksCurrentlyAvailable = new Book[10];
        for (int initailBook = 0; initailBook < booksCurrentlyAvailable.length; initailBook++) {
            booksCurrentlyAvailable[initailBook] = new Book();
        }
    }

    public Book[] getBooksCurrentlyAvailable() {
        return booksCurrentlyAvailable;
    }

    public void setBooksCurrentlyAvailable(Book[] booksCurrentlyAvailable) {
        this.booksCurrentlyAvailable = booksCurrentlyAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getBooksCurrentlyAvailable(), library.getBooksCurrentlyAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooksCurrentlyAvailable());

    }

    @Override
    public String toString() {
        return Arrays.toString(booksCurrentlyAvailable);

    }

}



