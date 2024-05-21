package system;

public class Player {

    int HP;

    public Player(){
        this.HP = 100;
    }

    public int getHP(){
        return this.HP;
    }

    public void printPlayer(){
        Utils.divider(20);
        System.out.println("PERSONAGEM");
        Utils.divider(20);
        System.out.println("Nome: Desconhecido.");
        System.out.println("HP: " + this.getHP());
        System.out.println();

        System.out.println("(1) Voltar para o Menu");
    }
}
