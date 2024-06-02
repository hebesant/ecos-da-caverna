
//isso aqui so serve pra guardar as strings da historia
public class Story {
    public static void printintro(){
        Util.clearConsole();
        Util.printSeparator(30);
        Util.printSlowly("""
            Você sente a água fria pingando em seu rosto. Seus olhos se abrem lentamente,
            confrontando uma escuridão densa e opressiva. Seus pensamentos são turvos,
            suas lembranças uma névoa distante. Onde estou? Quem sou eu?
            """);
        Util.anythingToContinue();
    }

    public static void firsAct(){
        Util.clearConsole();;
        Util.printSeparator(30);
        Util.printSlowly("""
             Ainda confuso, você se levanta com cuidado. De repente, uma música calma começa a
             tocar dentro da sala, ao mesmo tempo em que grunhidos surgem perto de você.
             """);
        Util.anythingToContinue();
    }
}
