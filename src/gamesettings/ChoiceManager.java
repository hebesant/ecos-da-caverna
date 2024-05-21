package gamesettings;
import java.util.*;

public class ChoiceManager {

    private static Scanner scanner = new Scanner(System.in);

    //Funcao para decisão com numeros inteiros.
    public static void choiceInt(Runnable... method1Runnables) {

        boolean decision = true;
        while (decision) {
            if(scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();


                switch (choice) {
                    case 1:
                        System.out.print("");
                        decision = false;
                        method1Runnables[0].run();
                        break;
                    case 2:
                        System.out.print("");
                        decision = false;
                        method1Runnables[1].run();
                        break;
                    case 3:
                        System.out.print("");
                        decision = false;
                        method1Runnables[2].run();
                        break;

                    default:
                        System.out.print("Por favor selecione uma opção válida");
                        break;
                }
            }else {
                System.out.println("Entrada inválida. Por favor insira um número inteiro.");
                scanner.next();
            }
        }
    }

    //Funcao para decisao sim ou n
    public static void choiceSN(Runnable... method1Runnables) {
        System.out.print("");
        System.out.print("Pressione qualquer tecla para continuar...");

        scanner.nextLine();

        boolean decision = true;
        while (decision) {
            String choice = scanner.nextLine();

            switch (choice) {
                case "s":
                    System.out.print("");decision = false;
                    method1Runnables[0].run();
                    break;
                case "n":
                    System.out.print("");
                    decision = false;
                    method1Runnables[1].run();
                    break;
                default:
                    System.out.print("Por favor selecione uma opção válida");
                    break;
            }
        }
    }

}

