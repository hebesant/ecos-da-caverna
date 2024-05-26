package game;
import java.util.*;

import story.room.one.RoomOne;
import system.*;

/*Classe principal onde o jogo ocorre*/
public class Main {
    public static void main(String[] args) {
        Player Player = new Player("Desconhecido", 100);
        Menu Menu = new Menu(Player);
        Scanner scanner = new Scanner(System.in);
        RoomOne.start();
    }
}