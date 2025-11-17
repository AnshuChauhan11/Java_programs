package Com_Sem.CodeWithAnshu;
// create a class
class lib{
    String books[];
    int no_of_books;
    lib(){
        this.books=new String[100];
        this.no_of_books=0;
    }
    // create a method for add book
    void addBook(String book){
        this.books[no_of_books]=book;
        System.out.println(book+" "+"has been added ! ");
        no_of_books++;
    }
    // create a method showBook
    void showBook(){
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.println("Available books are : ");
        for(String book:this.books){
            if (book==null){
                continue;
            }
            System.out.println("*"+book);
        }

    }
    // create a method issue Book
    void issueBook(String book){
        for (int i = 0; i <this.books.length; i++) {
            if (this.books[i]!=null && this.books[i].equals(book)){
                System.out.println("The book "+" "+book+" "+"has been issued : enjoy ☻ ");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("Books are not available ! sorry ♥ ");
    }

    // create a method return book
    void returnBook(String book){
        addBook(book);
    }
}
public class CWA_ONLINE_LIBRARY {
    public static void main(String[] args) {
        // create an object
        lib l=new lib();
        l.addBook("java");
        l.addBook("python");
        l.addBook("software Eng ");
        l.addBook("accounts");
        l.addBook("soft Skill");
        l.showBook();
        System.out.println("**************************");
        l.issueBook("java");
        l.issueBook("python");
        l.showBook();
        System.out.println("-------------------------");
        l.returnBook("java");
        l.showBook();
    }
}
