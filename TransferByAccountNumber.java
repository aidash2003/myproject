import java.util.ArrayList;

public class TransferByAccountNumber implements MoneyTransfer {
    private ArrayList<Client> clients;
    public TransferByAccountNumber(ArrayList<Client> clients) {
        this.clients = clients;
    }

    @Override
    public void pay(String sender, String recipient, int amount) {
        Client sender1 = findClientByAccountNumber(sender);
        Client recipient1 = findClientByAccountNumber(recipient);

        if (sender == null) {
            System.out.println("Sender with account number " + sender + " not found.");
            return;
        }

        if (recipient == null) {
            System.out.println("Recipient with account number " + recipient + " not found.");
            return;
        }

        if (sender1.getBalance() < amount) {
            System.out.println("Insufficient funds.");
            return;
        }

        sender1.setBalance(sender1.getBalance() - amount);
        recipient1.setBalance(recipient1.getBalance() + amount);

        System.out.println("Transfer successful.");
    }

    private Client findClientByAccountNumber(String accountNumber) {
        for (Client client : clients) {
            if (client.getAccountNumber().equals(accountNumber)) {
                return client;
            }
        }
        return null; // Client not found
    }
}