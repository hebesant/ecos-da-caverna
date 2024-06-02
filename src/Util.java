import java.util.Scanner;
public class Util {
    static Scanner scanner = new Scanner(System.in);

    //Limpa o console
    public static void clearConsole(){
        for(int i = 0; i < 100; i++){
            System.out.println();
        }
    }

    //Imprime tracos na tela para separar conteudos
    public static void printSeparator(int n){
        for(int i = 0; i < n; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    //printar o texto lento
    public static void printSlowly(String text) {
        int delay = 15;
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //printar título
    public static void printHeading(String title){
        Util.printSeparator(30);
        System.out.println(title);
        Util.printSeparator(30);
    }

    //pegar e tratar inut no console
    public static int readInt(String prompt, int userChoices){
        int input;
        do{
            System.out.println(prompt);
            try{
                input =  Integer.parseInt(scanner.next());
            }catch(Exception e){
                input = -1;
                System.out.println("Por favor digite um número inteiro!");
            }
        }while(input < 1 || input > userChoices);

        return input;
    }

    //metodo para esperar input e continuar
    public static void anythingToContinue(){
        System.out.println("\nDigite qualquer coisa para continuar...");
        scanner.next();
    }
}
