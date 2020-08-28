/*  Created by IntelliJ IDEA.
 *  User: Jai Kishan (jaikishan15)
 *  Date: 25/08/20
 *  Time: 9:00 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String nameOfTheStudent;
    private long universityRollNoOfStudent;
    private int noOfBooksIssuedByStudent;
    private Book[] namesOfTheBooksIssued = new Book[10];
    private int numberOfBooks = 0;

    public String getNameOfTheStudent() {
        return nameOfTheStudent;
    }

    public void setNameOfTheStudent(String nameOfTheStudent) {
        this.nameOfTheStudent = nameOfTheStudent;
    }

    public long getuniversityRollNoOfStudent() {
        return universityRollNoOfStudent;
    }

    public void setUniversityRollNoOfStudent(long universityRollNoOfStudent) {
        this.universityRollNoOfStudent = universityRollNoOfStudent;
    }

    public int getNoOfBooksIssuedByStudent() {
        return noOfBooksIssuedByStudent;
    }

    public void setNoOfBooksIssuedByStudent(int noOfBooksIssuedByStudent) {
        this.noOfBooksIssuedByStudent = noOfBooksIssuedByStudent;
    }


    public Student() {
        for (int i = 0; i < namesOfTheBooksIssued.length; i++) {
            namesOfTheBooksIssued[i] = new Book("Book " + (i + 1));
        }
    }

    Student(Book[] namesOfTheBooksIssued) {
        this.namesOfTheBooksIssued = namesOfTheBooksIssued;
    }


    public Book[] getNamesOfTheBooksIssued() {
        return namesOfTheBooksIssued.clone();
    }

    public void setNamesOfTheBooksIssued(Book[] namesOfTheBooksIssued) {
        this.namesOfTheBooksIssued = namesOfTheBooksIssued;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        /*
         *equals() method
         */
        Student student = (Student) o;
        return universityRollNoOfStudent == student.universityRollNoOfStudent &&
                getNoOfBooksIssuedByStudent() == student.getNoOfBooksIssuedByStudent() &&
                Objects.equals(getNameOfTheStudent(), student.getNameOfTheStudent()) &&
                Arrays.equals(namesOfTheBooksIssued, student.namesOfTheBooksIssued);
    }

    /*
     *hashcode() method
     */
    @Override
    public int hashCode() {
        int result = Objects.hash(getNameOfTheStudent(), universityRollNoOfStudent, getNoOfBooksIssuedByStudent());
        result = 31 * result + Arrays.hashCode(namesOfTheBooksIssued);
        return result;
    }

    //*
    // * toString() method
    // *


    @Override
    public String toString() {
        return "Student{" +
                "nameOfTheStudent='" + nameOfTheStudent + '\'' +
                ", universityRollNoOfStudent=" + universityRollNoOfStudent +
                ", noOfBooksIssuedByStudent=" + noOfBooksIssuedByStudent +
                ", namesOfTheBooksIssued=" + Arrays.toString(namesOfTheBooksIssued) +
                '}';
    }

    //*
    // * this method checks the name of the book student wants
    // * @para name the name of the book student wants
    public void issueNewBook(String nameOfBook) {
        System.out.println("The Book : " + nameOfBook + " Is Issued To You Successfully.");
        namesOfTheBooksIssued[numberOfBooks].setNameOfTheBook(nameOfBook);
        numberOfBooks++;
        System.out.println();
    }

    //*
    // * this method checks the name of the books the student wants to return.
    // *@para nameOfBookToBeReturned the names of the books to be returned
    public void returnBooks(String nameOfBookToBeReturned) {
        System.out.println("The Book : " + nameOfBookToBeReturned + "Is Returned Successfully To The Library.");
        System.out.println();
    }

    //*
    // * this method checks all the issue books to the student
    // *@para nameOfAllIssueBooks the names of all the issue books
    public void allIssuesBooks(String nameOfAllIssueBooks) {
        System.out.println(nameOfAllIssueBooks);
    }
}

