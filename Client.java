public class Client {
    private String name;
    private String accountNumber;
    private String phoneNumber;
    private int balance;

    // Конструктор по умолчанию
    public Client() {}

    // Конструктор не по умолчанию
    public Client(String name, String accountNumber, String phoneNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    // Геттеры и сеттеры для полей
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
    
