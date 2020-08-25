/*  Created by IntelliJ IDEA.
 *  User: Jai Kishan (jaikishan15)
 *  Date: 25/08/20
 *  Time: 9:00 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String nameOfTheStudent;
    private long universityRollNoOfStudent;
    private int noOfBooksIssuedByStudent;
    private int numberOfBooksIssued;
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


}
