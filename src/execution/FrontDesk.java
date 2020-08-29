/*  Created by IntelliJ IDEA.
 *  User: Jai Kishan (jaikishan15)
 *  Date: 23/08/20
 *  Time: 8:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_A_NEW_BOOK_FOR_ME = 1;
    private static final int RETURN_PREVIOUSLY_ISSUES_BOOK_FOR_ME = 2;
    private static final int SHOW_ME_ALL_MY_ISSUES_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentInput;
        Student myStudent = new Student();
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-\n");
            System.out.println("how may can i help you today");
            System.out.println("1.issue a new book for me");
            System.out.println("2.Return previously issues book for me");
            System.out.println("3.show me all my issues books");
            System.out.println("4.Exit");
            System.out.println("Please enter your choice from 1..4");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case ISSUE_A_NEW_BOOK_FOR_ME:
                    System.out.println("enter the name of the book you want");
                    scanner.nextLine();
                    String nameOfTheBook = scanner.nextLine();
                    myStudent.issueNewBook(nameOfTheBook);
                    break;
                case RETURN_PREVIOUSLY_ISSUES_BOOK_FOR_ME:
                    System.out.println("Enter The Name Of The Books That You Want To Return : ");
                    scanner.nextLine();
                    String nameOfReturnBooks = scanner.nextLine();
                    myStudent.returnBooks(nameOfReturnBooks);
                    break;
                case SHOW_ME_ALL_MY_ISSUES_BOOKS:
                    System.out.println("All Books Issued To You Are : ");
                    scanner.nextLine();
                    String allIsssueBooks = scanner.nextLine();
                    myStudent.allIssuesBooks(allIsssueBooks);
                    break;
                case EXIT:
                    System.out.println("Thanks For Coming.");
                    break;
                default:
                    System.out.println("Wrong Choice. Choose Between 1..4:");
                    break;
            }
        } while (studentInput != EXIT);
        scanner.close();
    }
}