package COM.CWH_ANSHU;

class library{
   String[] book;
   int no_of_books;

   // creating a constructor
    library(){
        this.book=new String[100];
        this.no_of_books=0;
    }
    // first method
    public void addBook(String book){
            this.book[no_of_books]=book;
            no_of_books++;
        System.out.println("The Book "+" "+book+" "+"has been added successfully ....");
    }

    // second method
    public void issueBook(String book){
        System.out.println("***********************************************************");
        for (int i = 0; i <this.book.length ; i++) {
            if (this.book[i]!=null && this.book[i].equals(book)){
                System.out.println("The book has been issued ! and book name is = "+book);
                this.book[i]=null;
                return;
            }
        }
        System.out.println("This book is not available ! sorry ");
    }

    // third method
    public void returnBook(String book){
        System.out.println("----------------------------------------------");
        addBook(book);
    }

    // fourth book
    public void showAvailableBook(){
        {
            System.out.println("***************Available***Books***are.......");
            for (String book : this.book) {
//            for (int i = 0; i <this.book.length ; i++) {

                if (book == null){
                    continue;
                }
                System.out.println("*"+book);
            }
        }
    }

}

public class CWH_EXERCISE_4_ONLINE_LIBRARY {
    public static void main(String[] args) {
        /*
            you have to implement a library using java class library
            Methods: addBook,issueBook,returnBook,showAvailableBook
            Properties: Array to store the available book
                    Array to store the issue book
         */

            library lib=new library();
            lib.addBook("Data Structure");
            lib.addBook("c++");
            lib.addBook("Python");
            lib.addBook("Computer Architecture");
            lib.showAvailableBook();

            lib.issueBook("Data Structure");
            lib.showAvailableBook();

            lib.returnBook("Data Structure");
            lib.showAvailableBook();
    }
}
