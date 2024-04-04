import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создаем список клиентов
        ArrayList<Client> clients = new ArrayList<>();
        clients.add(new Client("her", "123456789", "+1234567890", 1000));
        clients.add(new Client("him", "987654321", "+9876543210", 2000));

        // Создаем экземпляр банка
        Bank bank = new Bank();

        // Читаем информацию о клиентах из файла
        bank.readClients("input.txt");

        // Выполняем перевод средств
        MoneyTransfer transfer = new TransferByAccountNumber(clients);
        bank.executeTransfer(transfer, "123456789", "987654321", 500);

        // Сохраняем информацию о клиентах в файл
        bank.saveClientsInfo("output.txt");
    }
}