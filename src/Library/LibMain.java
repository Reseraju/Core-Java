package Library;

import java.util.ArrayList;
import java.util.Scanner;
 
public class LibMain {
    private static ArrayList<Book> bookList = new ArrayList<>();
    private static ArrayList<Member> memberList = new ArrayList<>();
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
 
        do {
            System.out.println("\n--- Book Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Update Book");
            System.out.println("4. View All Books");
            System.out.println("5. add Members");
            System.out.println("6. Remove members");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
 
            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    removeBook(scanner);
                    break;
                case 3:
                    updateBook(scanner);
                    break;
                case 4:
                    viewAllBooks();
                    break;
                case 5:
                	addMembers(scanner);
                	break;
                case 6:
                	removeMember(scanner);
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 7);
 
        scanner.close();
    }
 
    // Method to add a new book
    public static void addBook(Scanner scanner) {
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Book Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Book Price: ");
        double price = scanner.nextDouble();
 
        Book newBook = new Book(id, title, author, price);
        bookList.add(newBook);
        System.out.println("Book added successfully!");
    }
 
    // Method to remove a book by ID
    public static void removeBook(Scanner scanner) {
        System.out.print("Enter Book ID to remove: ");
        int id = scanner.nextInt();
 
        Book bookToRemove = null;
        for (Book book : bookList) {
            if (book.getId() == id) {
                bookToRemove = book;
                break;
            }
        }
 
        if (bookToRemove != null) {
            bookList.remove(bookToRemove);
            System.out.println("Book removed successfully!");
        } else {
            System.out.println("Book not found!");
        }
    }
 
    // Method to update a book's details by ID
    public static void updateBook(Scanner scanner) {
        System.out.print("Enter Book ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline
 
        for (Book book : bookList) {
            if (book.getId() == id) {
                System.out.print("Enter new title: ");
                book.setTitle(scanner.nextLine());
                System.out.print("Enter new author: ");
                book.setAuthor(scanner.nextLine());
                System.out.print("Enter new price: ");
                book.setPrice(scanner.nextDouble());
                System.out.println("Book updated successfully!");
                return;
            }
        }
 
        System.out.println("Book not found!");
    }
 
    // Method to view all books
    public static void viewAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
    }
    
    //Method to add new member
    public static void addMembers(Scanner scanner) {
    	System.out.print("Enter member ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter member name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        
 
        Member newMember = new Member(id, name, email);
        memberList.add(newMember);
        System.out.println("Member added successfully!");
    }
    
    // Method to remove a member by ID
    public static void removeMember(Scanner scanner) {
        System.out.print("Enter member ID to remove: ");
        int id = scanner.nextInt();
 
        Member memberToRemove = null;
        for (Member member : memberList) {
            if (member.getMemberID() == id) {
                memberToRemove = member;
                break;
            }
        }
 
        if (memberToRemove != null) {
            bookList.remove(memberToRemove);
            System.out.println("Member removed successfully!");
        } else {
            System.out.println("Member not found!");
        }
    }
    
    
}