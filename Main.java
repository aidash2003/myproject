import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<>();
        clients.add(new Client("John", "123456789", "+1234567890", 1000));
        clients.add(new Client("Jane", "987654321", "+9876543210", 2000));
        writeClientsToFile(clients, "input.txt");
        Bank bank = new Bank();
        bank.readClients("input.txt");
        MoneyTransfer transfer = new TransferByAccountNumber(clients);
        bank.executeTransfer(transfer, "123456789", "987654321", 500);
        bank.saveClientsInfo("output.txt");
		
    }

    private static void writeClientsToFile(ArrayList<Client> clients, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Client client : clients) {
                writer.write(client.getName() + " " + client.getAccountNumber() + " " +
                        client.getPhoneNumber() + " " + client.getBalance() + "\n");
            }
            System.out.println("Information about client writed " + fileName);
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}