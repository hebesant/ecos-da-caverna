

public class Player extends Character {

    //numero de uprades nos tracos
    public int numAtkUpgrades, numDefUpgrades;

    //stats exclusivos do jogador
    int gold, restsLeft, pots;

    //nomes fodas dos tracos
    public String[] atkUpgrades = {"Força", "Fúria", "Vigor", "Força Divina"};
    public String[] defUpgrades = {"Resistência", "Pele Dura", "Couraça Escamada", "Aura Sagrada"};

    public Player(String name){
        super(name, 100, 0);
        this.numAtkUpgrades = 0;
        this.numDefUpgrades = 0;
        this.gold = 0;
        this.restsLeft = 0;
        this.pots = 0;
        //escolher um traco ao criar um personagem
        chooseTrait();
    }

    //metodos do joagdor
    @Override
    public int attack() {
        return (int) (Math.random() * (xp/4 + numAtkUpgrades * 3 + 3) + xp/10 + numAtkUpgrades * 2 + numDefUpgrades + 1);
    }

    @Override
    public int defend() {
        return (int) (Math.random() * (xp/4 + numDefUpgrades * 3 + 3) + xp/10 + numDefUpgrades * 2 + numAtkUpgrades + 1);
    }

    public void chooseTrait(){
        Util.clearConsole();
        Util.printHeading("Escolha um traço: ");
        System.out.println("(1) " + atkUpgrades[numAtkUpgrades]);
        System.out.println("(2) " + defUpgrades[numDefUpgrades]);
        //escolha do jogador
        int input = Util.readInt("-> ", 2);
        Util.clearConsole();
        if(input == 1){
            Util.printHeading("Você escolheu " + atkUpgrades[numAtkUpgrades]);
            numAtkUpgrades++;
        }else {
            Util.printHeading("Você escolheu " + defUpgrades[numDefUpgrades]);
            numDefUpgrades++;
        }
        Util.anythingToContinue();
    }
}
