import java.util.Scanner;

public class CarMenu {

    public void viewCarsMenu (){

        Menu menu = new Menu();

        System.out.println();
        menu.tools.customizedButton(120, menu.BIG_HEIGHT, "Cars menu");

        menu.getMainOptions(">1< See cars", ">2< Update car", ">3< New car", ">4< \"Delete car\"");

        getSwitchMain();




    }
    private int getI(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public void getSwitchMain(){

        int i = getI();

        CarHandler carHandler = new CarHandler();

        switch (i){
            case 1 -> carHandler.read();

            case 3 -> carHandler.create();

        }


    }
}
