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
    }

    public static void divisoria(int tamanho){
        for(int i = 0 ; i < tamanho; i++){
            System.out.print("-");
        }
        System.out.println();
    }
}
