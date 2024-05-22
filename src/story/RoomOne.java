package story;

import system.Utils;

public class RoomOne {

    public static void introduction(){
        String introduction = ("""
            Você sente a água fria pingando em seu rosto. Seus olhos se abrem lentamente,
            confrontando uma escuridão densa e opressiva. Seus pensamentos são turvos,
            suas lembranças uma névoa distante. Onde estou? Quem sou eu?
            """);
        Utils.printSlowly(introduction);
    }

    public static void continuar(){
        System.out.println("Olá");
    }
}
