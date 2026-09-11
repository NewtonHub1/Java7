import java.util.Scanner;

class ConstructionQuestionIm {
    int bookId;
    String title;
    String author;

    ConstructionQuestionIm(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    void displayInformation() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class ConstructionQuestionM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int bookId = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        ConstructionQuestionIm book1 =
                new ConstructionQuestionIm(bookId, title, author);

        book1.displayInformation();

        sc.close();
    }
}
