import java.util.Scanner;

interface Borrow {
    void borrowBook(String student,String bookName);
}
interface ReturnBook {
    void returnBook(String student,String bookName,int duration);
}

class Library implements Borrow, ReturnBook {
    public void borrowBook(String student,String bookName) {
        System.out.println("Student: " + student + "\tBook Name: " + bookName);
    }
    public void returnBook(String student,String bookName,int duration) {
        System.out.println("Student: " + student + "\tBook Name: " + bookName + "\tDuration: " + duration);
    }
}
public class library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Book Name: ");
        String book = sc.nextLine();
        System.out.println("Enter Duration: ");
        int duration = sc.nextInt();

        Library lib = new Library();
        lib.borrowBook(name, book);
        lib.returnBook(name, book, duration);
        sc.close();
    }
}
