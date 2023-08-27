import io.Console;
import services.SneakerService;

import java.util.Scanner;

public class App {
    private SneakerService sneakerService = new SneakerService(); // (1)
    Scanner input = new Scanner(System.in);
    public static void main(String... args){
        App application = new App(); // (2)
        application.init();  // (3)
    }

    public void init(){
        // (4)
        // application logic here
        // call methods to take user input and interface with services
        Console.printWelcome();
        Console.mainMenu();
        Console.mainMenuLogic(input.nextInt());
    }
}
