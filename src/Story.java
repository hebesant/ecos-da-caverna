package net.rpg.main;

//isso aqui so serve pra guardar as strings da historia
public class Story {
    public static void printintro(){
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        GameLogic.printSlowly("""
            Você sente a água fria pingando em seu rosto. Seus olhos se abrem lentamente,
            confrontando uma escuridão densa e opressiva. Seus pensamentos são turvos,
            suas lembranças uma névoa distante. Onde estou? Quem sou eu?
            """);
        GameLogic.anythingToContinue();
    }

    public static void firsAct(){
        GameLogic.clearConsole();;
        GameLogic.printSeparator(30);
        GameLogic.printSlowly("""
             Ainda confuso, você se levanta com cuidado. De repente, uma música calma começa a
             tocar dentro da sala, ao mesmo tempo em que grunhidos surgem perto de você.
             """);
        GameLogic.anythingToContinue();
    }
}
