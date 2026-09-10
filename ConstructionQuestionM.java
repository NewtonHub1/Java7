
class ConstructionQuestionIm {
    int bookId;
    String title;
    String author;

    ConstructionQuestionIm(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
}

  
    void displayInformation() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        
    }
public class ConstructionQuestionM {

     public static void main(String[] args) {

        ConstructionQuestionIm book1 = 
        new ConstructionQuestionIm(2, "Java Programming", "Newton");

        book1.displayInformation();
        
    }
}


   