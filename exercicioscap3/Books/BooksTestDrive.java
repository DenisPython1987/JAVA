package exercicioscap3.Books;

public class BooksTestDrive {
    public static void main(String[] args){
        Books[] myBooks = new Books[3];
        int x = 0;
        int y = 0;

        while (y < 3) {
            myBooks[y] = new Books();
            y = y + 1;
        }

        myBooks[0].title = "The grapes of java";
        myBooks[1].title = "The java gatsby";
        myBooks[2].title = "The java cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while (x < 3) {
            System.out.println(myBooks[x].title);
            System.out.println(" By ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}
