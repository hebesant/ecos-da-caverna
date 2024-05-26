package system;
import gamesettings.*;

public class Menu {

    Player Player;
    public Menu(Player newPlayer){
        this.Player = newPlayer;
    }

    public void mainMenu(){
        Utils.clear();
        Utils.divider(20);
        System.out.println("MENU");
        System.out.println("Qual sua próxima ação?");
        Utils.divider(20);
        System.out.println("(1) Avançar");
        System.out.println("(2) Informações do personagem");
        System.out.println("(3) Encerrar o jogo");

        ChoiceManager.choiceInt(
                () -> {

                },
                () -> {
                    this.statusPlayer();// Exibe informações do jogador
                },
                () -> {
                    System.out.println("Encerrando o jogo...");
                    System.exit(0); // Encerra o jogo
                }
        );
    }

    public void statusPlayer(){
        Player.printPlayer();
        ChoiceManager.choiceInt(
                () -> {
                    this.mainMenu(); // Chama o menu principal passando o jogador
                }
        );
    }
}
