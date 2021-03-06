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
    private String nameOfTheStudent; // first name, middle name, last name
    private long universityRollNoOfStudent;
    private int noOfBooksIssuedByStudent;
    private Book[] namesOfTheBooksIssued = new Book[10];
    private int numberOfBooks = 0;

    public Student() {
        for (int i = 0; i < namesOfTheBooksIssued.length; i++) {
            namesOfTheBooksIssued[i] = new Book("Book " + (i + 1));
        }
    }

    Student(Book[] namesOfTheBooksIssued) {
        this.namesOfTheBooksIssued = namesOfTheBooksIssued;
    }

    //* this method returns the name of the student
    // *
    public String getNameOfTheStudent() {
        return nameOfTheStudent;
    }

    //* this method sets the name of the student
    // * @param name of the student
    // *
    public void setNameOfTheStudent(String nameOfTheStudent) {
        this.nameOfTheStudent = nameOfTheStudent;
    }

    //*
    // * this method returns the universityRollNoOfStudent
    // *
    public long getuniversityRollNoOfStudent() {
        return universityRollNoOfStudent;
    }

    // this method set the unuiversityRollNoOfStudent
    //@ param unuiversityRollNoOfStudent
    public void setUniversityRollNoOfStudent(long universityRollNoOfStudent) {
        this.universityRollNoOfStudent = universityRollNoOfStudent;
    }

    //*
    // * this method returns the noOfBooksIssuedbyTheStudent
    // *
    public int getNoOfBooksIssuedByStudent() {
        return noOfBooksIssuedByStudent;
    }

    //* this mehtod sets the noOfBooksIssuedByStudent
    // * @param noOfBooksIssuedByStudent
    // *
    public void setNoOfBooksIssuedByStudent(int noOfBooksIssuedByStudent) {
        this.noOfBooksIssuedByStudent = noOfBooksIssuedByStudent;
    }

    //*
    // * this method returns the nameOfTheBooksIssued
    // *
    public Book[] getNamesOfTheBooksIssued() {
        return namesOfTheBooksIssued.clone();
    }

    //*
    // this method sets the namesOfTheBooksIssued
    // * @param namesOfTheBooksIssued
    public void setNamesOfTheBooksIssued(Book[] namesOfTheBooksIssued) {
        this.namesOfTheBooksIssued = namesOfTheBooksIssued;
    }

    //*
    // *equals() method
    // *

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
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
    // * @param name the name of the book student wants
    public void issueNewBook(String nameOfBook) {
        System.out.println("The Book : " + nameOfBook + " Is Issued To You Successfully.");
        namesOfTheBooksIssued[numberOfBooks].setNameOfTheBook(nameOfBook);
        numberOfBooks++;
        System.out.println();
    }

    //*
    // * this method checks the name of the books the student wants to return.
    // *@param nameOfBookToBeReturned the names of the books to be returned
    public void returnBooks(String nameOfBookToBeReturned) {
        System.out.println("The Book : " + nameOfBookToBeReturned + "Is Returned Successfully To The Library.");
        System.out.println();
    }

    //*
    // * this method checks all the issue books to the student
    // *@param nameOfAllIssueBooks the names of all the issue books
    public void allIssuesBooks(String nameOfAllIssueBooks) {
        System.out.println(nameOfAllIssueBooks);
    }
}

