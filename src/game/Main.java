package game;
import java.util.*;

import gamesettings.*;
import system.*;
import story.*;

/*Classe principal onde o jogo ocorre*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Utils.printSlowly(Cave.introduction());
        ChoiceManager.aguardarTecla();
        Utils.clear();



    }
}