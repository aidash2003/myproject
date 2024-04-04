import java.util.ArrayList;

public class TransferByPhoneNumber implements MoneyTransfer {
    private ArrayList<Client> clients;

    public TransferByPhoneNumber(ArrayList<Client> clients) {
        this.clients = clients;
    }

    @Override
    public void pay(String senderPhoneNumber, String recipientPhoneNumber, int amount) {
        Client sender1 = findClientByPhoneNumber(senderPhoneNumber);
        Client recipient1 = findClientByPhoneNumber(recipientPhoneNumber);

        if (sender == null) {
            System.out.println("Sender with phone number " + senderPhoneNumber + " not found.");
            return;
        }

        if (recipient == null) {
            System.out.println("Recipient with phone number " + recipientPhoneNumber + " not found.");
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

    private Client findClientByPhoneNumber(String phoneNumber) {
        for (Client client : clients) {
            if (client.getPhoneNumber().equals(phoneNumber)) {
                return client;
            }
        }
        return null; 
    }
}