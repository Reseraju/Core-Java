import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        
        List<Bank> users = new ArrayList<>();
        while (!exit) {
            System.out.println("========= Main Menu =========");
            System.out.println("1. New Customer");
            System.out.println("2. Show All Customers");
            System.out.println("3. Close Account");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Transfer");
            System.out.println("7. Transfer");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();  
            
            switch (choice) {
                case 1:
                    System.out.println("Creating a new customer...");
                    Bank bank = new Bank();
                    
                    System.out.println("Enter name: ");
                    String name = sc.nextLine();
                    bank.setName(name);
                    
//                    System.out.println("Enter accNo: ");
//                    int accNo = sc.nextInt();
//                    bank.setAccNo(accNo);
//                    sc.nextLine();  
                    
                    System.out.println("Enter email: ");
                    String email = sc.nextLine();
                    bank.setEmail(email);
                    
                    System.out.println("Enter balance: ");
                    int balance = sc.nextInt();
                    bank.setBalance(balance);
                    
                    users.add(bank); 
                    System.out.println("Customer added successfully.");
                    break;
                    
                case 2:
                    System.out.println("Showing all customers...");
                    if (users.isEmpty()) {
                        System.out.println("No customers found.");
                    } else {
                        for (Bank user : users) {
                            System.out.println(user);
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("Closing an account...");
                    System.out.println("Enter account number to close: ");
                    int closeAccNo = sc.nextInt();
                    Bank userToRemove = null;
                    for (Bank user : users) {
                        if (user.getAccNo() == closeAccNo) {
                            userToRemove = user;
                            break;
                        }
                    }
                    if (userToRemove != null) {
                        users.remove(userToRemove);
                        System.out.println("Account closed successfully.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                    
                case 4:
                    System.out.println("Depositing money...");
                    System.out.println("Enter account number: ");
                    int depositAccNo = sc.nextInt();
                    System.out.println("Enter deposit amount: ");
                    int depositAmount = sc.nextInt();
                    boolean found = false;
                    for (Bank user : users) {
                        if (user.getAccNo() == depositAccNo) {
                            user.setBalance(user.getBalance() + depositAmount);
                            System.out.println("Deposit successful. New balance: " + user.getBalance());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found.");
                    }
                    break;
                    
                case 5:
                    System.out.println("Withdrawing money...");
                    System.out.println("Enter account number: ");
                    int withdrawAccNo = sc.nextInt();
                    System.out.println("Enter withdrawal amount: ");
                    int withdrawAmount = sc.nextInt();
                    boolean withdrawalSuccess = false;
                    for (Bank user : users) {
                        if (user.getAccNo() == withdrawAccNo) {
                            if (user.getBalance() >= withdrawAmount) {
                                user.setBalance(user.getBalance() - withdrawAmount);
                                System.out.println("Withdrawal successful. New balance: " + user.getBalance());
                                withdrawalSuccess = true;
                            } else {
                                System.out.println("Insufficient balance.");
                            }
                            break;
                        }
                    }
                    if (!withdrawalSuccess) {
                        System.out.println("Account not found.");
                    }
                    break;
                    
                case 6:
                    System.out.println("Transferring money...");
                    System.out.println("Enter sender account number: ");
                    int senderAccNo = sc.nextInt();
                    System.out.println("Enter receiver account number: ");
                    int receiverAccNo = sc.nextInt();
                    System.out.println("Enter transfer amount: ");
                    int transferAmount = sc.nextInt();
                    
                    Bank sender = null;
                    Bank receiver = null;
                    for (Bank user : users) {
                        if (user.getAccNo() == senderAccNo) {
                            sender = user;
                        }
                        if (user.getAccNo() == receiverAccNo) {
                            receiver = user;
                        }
                    }
                    
                    if (sender != null && receiver != null) {
                        if (sender.getBalance() >= transferAmount) {
                            sender.setBalance(sender.getBalance() - transferAmount);
                            receiver.setBalance(receiver.getBalance() + transferAmount);
                            System.out.println("Transfer successful.");
                        } else {
                            System.out.println("Insufficient balance in sender's account.");
                        }
                    } else {
                        System.out.println("Invalid account numbers provided.");
                    }
                    break;
                case 7:
                	System.out.println("Printing Toatal customers enrolled");
                	
                	break;
                case 8:
                    System.out.println("Exiting the application...");
                    exit = true;
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
        
        sc.close();
    }
}
