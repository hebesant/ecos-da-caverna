package story.room.one;

import gamesettings.ChoiceManager;
import system.Utils;

public class RoomOne {

    public static void start(){
        Utils.printSlowly("""
            Você sente a água fria pingando em seu rosto. Seus olhos se abrem lentamente,
            confrontando uma escuridão densa e opressiva. Seus pensamentos são turvos,
            suas lembranças uma névoa distante. Onde estou? Quem sou eu?
            """);
        Utils.waitInput();

        Utils.printSlowly("""
             Ainda confuso, você se levanta com cuidado. De repente, uma música calma começa a
             tocar dentro da sala, ao mesmo tempo em que grunhidos surgem perto de você.
                """);

        Utils.waitInput();

        Utils.clear();
        Utils.divider(20);
        System.out.println("MENU");
        System.out.println("Qual sua próxima ação?");
        Utils.divider(20);
        System.out.println("(1) Seguir a música");
        System.out.println("(2) Ficar parado");
        System.out.println("(3) Encerrar o jogo");

        ChoiceManager.choiceInt(
                () -> {
                    RoomOne.firstPuzzle();
                },
                () -> {
                    RoomOne.firstBattle();
                },
                () -> {
                    System.out.println("Encerrando o jogo...");
                    System.exit(0); // Encerra o jogo
                }
        );
    }

    public static void firstBattle(){

    }

    public static void firstPuzzle(){

    }

}
