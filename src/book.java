import java.io.*;
import java.util.Scanner;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class book {

    public static void main(String[] args) {

        String BookName;
        String AuthorName;
        String Isbn;

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int flagVariable = number;
        if (number != 0) {
            while (number != 0) {
                if (number == flagVariable)
                    sc.nextLine();
                BookName = sc.nextLine();
                AuthorName = sc.nextLine();
                Isbn = sc.nextLine();

                System.out.println("-----------------------------");
                System.out.println("Book Name:\t" + BookName);
                System.out.println("Author Name:\t" + AuthorName);
                System.out.println("ISBN:\t" + Isbn);
                System.out.println("-----------------------------");
                number--;
            }
        } else
            System.out.println("N/A");
    }
}
