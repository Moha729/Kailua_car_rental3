import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();


        menu.getWelcomeScreen("Welcome to Kailua Car Rental");

        menu.getMainOptions(">1< Available cars", ">2< Customers", ">3< New rental", ">4< Active rentals");

        menu.getSwitchMain();



    }
}
