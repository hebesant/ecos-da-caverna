package gamesettings;
import java.util.*;

public class ChoiceManager {

    private static Scanner scanner = new Scanner(System.in);

    //Funcao para decisão com numeros inteiros.
    public static void choiceInt(Runnable... options) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int escolha = scanner.nextInt();

                if (escolha >= 1 && escolha <= options.length) {
                    options[escolha - 1].run();
                    break;  // Saímos do loop se a escolha for válida e executada
                } else {
                    System.out.println("Escolha inválida. Por favor, tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next();  // Consumimos a entrada inválida para evitar loop infinito
            }
        }

        scanner.close();
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

