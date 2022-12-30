package Task19;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Client[] createClients(int count) {
        Client[] clients = new Client[count];
        Random random = new Random();
        int[] randomCountInn = new int[]{10, 12};

        for (int i = 0; i < clients.length; i++) {
            StringBuilder inn = new StringBuilder();
            for (int j = 0; j < randomCountInn[random.nextInt(0, 1)]; j++) {
                inn.append(random.nextInt(0, 9));
            }
            if (!Objects.equals(INN.isValidate(inn.toString()), "")) {
                clients[i] = new Client(
                        new INN(inn.toString()),
                        String.format("Name%d", i),
                        String.format("Surname%d", i),
                        String.format("Patronymic%d", i)
                );
            }
        }

        return clients;
    }

    public static void main(String[] args) {
        Client[] clients = createClients(10);
        for (Client client : clients) {
            System.out.println(client);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert inn: ");
        String inn = scanner.nextLine();
        if (INN.isValidate(inn).equals("")){
            System.out.println("Task19.INN NOT VALIDATE");
        }
        else {
            System.out.print("Insert name: ");
            String name = scanner.nextLine();
            System.out.print("Insert surname: ");
            String surname = scanner.nextLine();
            System.out.print("Insert patronymic: ");
            String patronymic = scanner.nextLine();

            Client client = new Client(
                    new INN(inn),
                    name,
                    surname,
                    patronymic
            );

            if (INN.isValidate(clients, client)){
                System.out.println("Task19.Client is validate");
            }
            else {
                System.out.println("Task19.Client is not validate");
            }
        }
    }
}
