import java.util.Scanner;

public class Menu {

    public final int BIG_WIDTH = 100;
    public final int BIG_HEIGHT = 3;

    private final int SMALL_WIDTH = 50;
    private final int SMALL_HEIGHT = 2;

    MoTools tools = new MoTools();

    Scanner scan = new Scanner(System.in);

    public void getWelcomeScreen(String text){
        tools.customizedButton(120, 7, text);
    }

    public void getMainOptions(String text1, String text2, String text3, String text4){
        System.out.print(tools.dobbleButton(text1, text2));
        System.out.print(tools.dobbleButton(text3, text4));


    }
    private int getI(){
        return scan.nextInt();
    }

    public void getSwitchMain(){

        int i = getI();

        CarMenu carMenu = new CarMenu();

        switch (i){
            case 1 -> carMenu.viewCarsMenu();

        }




    }
}
