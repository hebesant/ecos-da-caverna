package gamesettings;
import java.util.*;

public class ChoiceManager {

    private static Scanner scanner = new Scanner(System.in);

    public static void aguardarTecla(){
        System.out.println("Pressione qualquer tecla para continuar...\n");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
