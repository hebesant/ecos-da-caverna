package game;
import java.util.*;

import system.*;
import story.*;

/*Classe principal onde o jogo ocorre*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RoomOne.introduction();
        Utils.waitInput();
        Utils.clear();

        Player Player = new Player();

        Menu Menu = new Menu(Player);

        Menu.mainMenu();







    }
}