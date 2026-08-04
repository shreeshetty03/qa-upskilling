package day07;

public class Main {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount(1000.0);
        System.out.println("Initial Balance: " + account.getBalance());

        // Deposit money
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Withdraw money
        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Create a Person object
        Person person = new Person("Alice", 30);
        System.out.println("Person's Name: " + person.getName());
        System.out.println("Person's Age: " + person.getAge());
    }
    
}
