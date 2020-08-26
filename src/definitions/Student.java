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
    private Book[] namesOfTheBooksIssued;

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
        this.namesOfTheBooksIssued = new Book[10];
        for (int i = 0; i < namesOfTheBooksIssued.length; i++) {
            namesOfTheBooksIssued[i] = new Book();
        }
    }

    Student(Book[] namesOfTheBooksIssued) {
        this.namesOfTheBooksIssued = namesOfTheBooksIssued;
    }


    public Book[] getNamesOfTheBooksIssued() {
        return namesOfTheBooksIssued;
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
         *equals() mehtod
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
}

