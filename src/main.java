
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Freelancer> freelancers = new ArrayList<>();
        List<Client> clients = new ArrayList<>();
        List<Work> works = new ArrayList<>();
        List<Contract> contracts = new ArrayList<>();
        freelancers.add(new Freelancer("F001", "Sigma", "Gyatt", 4.5));
        clients.add(new Client("C001", "Skibidi", "Rizzler"));
        boolean running = true;
    while(running) {
        System.out.println("Welcome to Jart's Freelancing Rift, what kind of user are yahh? press dem number please:");
        System.out.println("<1> The Freelancer");
        System.out.println("<2> The Client");
        System.out.println("<3> Use the escape pod to exit the rift");
        System.out.println("Pick now!: ");
        int userPick = scanner.nextInt();
        scanner.nextLine();
    switch (userPick){
        case 1: freelancerMenu(scanner, freelancers, clients, contracts);
        break;
        case 2: clientMenu(scanner, freelancers, clients, contracts);
        break;
        case 3: {
            running  = false;
            System.out.println("GET OUTTA HERE!");
        }
        default: System.out.println("SALA MAN NA YAHH, LIWATA.");
    }
    }
    scanner.close();
    }
    private static void freelancerMen