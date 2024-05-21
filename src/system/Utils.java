package system;

public class Utils {


    public static void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

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
        System.out.println();
    }

    public static void divider(int tamanho){
        for(int i = 0 ; i < tamanho; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    public static void waitInput(){
        System.out.print("Pressione qualquer tecla para continuar...\n");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
