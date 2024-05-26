package system;

public class Player extends Character {

    int HP;

    public Player(String nome, int HP){
        super(nome, HP);

    }



    public void printPlayer(){
        Utils.clear();
        Utils.divider(20);
        System.out.println("PERSONAGEM");
        Utils.divider(20);
        System.out.println("Nome: Desconhecido.");
        System.out.println("HP: " + this.getHP());
        Utils.divider(20);

        System.out.println("(1) Voltar para o Menu");
    }
}
