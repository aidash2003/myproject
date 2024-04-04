import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Client> clients;

    public Bank() {
        clients = new ArrayList<>();
    }

    public Bank(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public void executeTransfer(MoneyTransfer transfer, String sender, String recipient, int amount) {
		//overriding
        transfer.pay(sender, recipient, amount);
    }

    public void readClients() {
        readClients("input.txt");
    }
//overloading
    public void readClients(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 4) {
                    String name = parts[0];
                    String accountNumber = parts[1];
                    String phoneNumber = parts[2];
                    int balance = Integer.parseInt(parts[3]);
                    clients.add(new Client(name, accountNumber, phoneNumber, balance));
                }
            }
            System.out.println("Clients loaded successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading clients: " + e.getMessage());
        }
    }

    public void saveClientsInfo() {
        saveClientsInfo("output.txt");
    }

    public void saveClientsInfo(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Client client : clients) {
                writer.write(client.getName() + " " + client.getAccountNumber() + " " +
                        client.getPhoneNumber() + " " + client.getBalance() + "\n");
            }
            System.out.println("Client information saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving client information: " + e.getMessage());
        }
    }
}
//Overriding
//public void executeTransfer(MoneyTransfer transfer, String sender, String recipient, int amount) {
		
        //transfer.pay(sender, recipient, amount);
    //}
	/*//overloading
    public void readClients(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 4) {
                    String name = parts[0];
                    String accountNumber = parts[1];
                    String phoneNumber = parts[2];
                    int balance = Integer.parseInt(parts[3]);
                    clients.add(new Client(name, accountNumber, phoneNumber, balance));
                }
            }
            System.out.println("Clients loaded successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading clients: " + e.getMessage());
        }
    }*/
