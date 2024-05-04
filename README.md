import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao jogo de RPG!");
        System.out.println("Escolha uma classe para o seu personagem:");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        System.out.println("3 - Arqueiro");
        int escolhaClasse = scanner.nextInt();
        
        Personagem jogador = null;
        switch (escolhaClasse) {
            case 1:
                jogador = new Guerreiro();
                break;
            case 2:
                jogador = new Mago();
                break;
            case 3:
                jogador = new Arqueiro();
                break;
            default:
                System.out.println("Opção inválida. Saindo do jogo.");
                return;
        }
        
        System.out.println("Você escolheu a classe " + jogador.getNome() + ".");
        System.out.println("Um inimigo se aproxima!");
        
        Inimigo inimigo = new Inimigo();
        
        while (jogador.estaVivo() && inimigo.estaVivo()) {
            System.out.println("Escolha uma ação:");
            System.out.println("1 - Atacar");
            System.out.println("2 - Curar");
            int acao = scanner.nextInt();
            
            if (acao == 1) {
                jogador.atacar(inimigo);
            } else if (acao == 2) {
                jogador.curar();
            } else {
                System.out.println("Ação inválida. Tente novamente.");
            }
            
            if (inimigo.estaVivo()) {
                inimigo.atacar(jogador);
            }
            
            System.out.println("Estado do jogador: " + jogador);
            System.out.println("Estado do inimigo: " + inimigo);
        }
        
        if (jogador.estaVivo()) {
            System.out.println("Parabéns! Você derrotou o inimigo.");
        } else {
            System.out.println("Game Over. O inimigo venceu.");
        }
        
        scanner.close();
    }
}

abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int dano;
    
    public String getNome() {
        return nome;
    }
    
    public boolean estaVivo() {
        return vida > 0;
    }
    
    public void atacar(Personagem alvo) {
        System.out.println(nome + " ataca " + alvo.nome + " causando " + dano + " de dano.");
        alvo.vida -= dano;
    }
    
    public void curar() {
        System.out.println(nome + " se cura.");
        vida += 10;
    }
    
    @Override
    public String toString() {
        return nome + " (Vida: " + vida + ")";
    }
}

class Guerreiro extends Personagem {
    public Guerreiro() {
        nome = "Guerreiro";
        vida = 100;
        dano = 20;
    }
}

class Mago extends Personagem {
    public Mago() {
        nome = "Mago";
        vida = 80;
        dano = 30;
    }
    
    @Override
    public void atacar(Personagem alvo) {
        super.atacar(alvo);
        System.out.println("O ataque do Mago enfraquece o inimigo.");
        alvo.dano -= 5;
    }
}

class Arqueiro extends Personagem {
    public Arqueiro() {
        nome = "Arqueiro";
        vida = 90;
        dano = 25;
    }
    
    @Override
    public void atacar(Personagem alvo) {
        super.atacar(alvo);
        System.out.println("O Arqueiro atira uma flecha venenosa.");
        alvo.vida -= 10;
    }
}

class Inimigo extends Personagem {
    public Inimigo() {
        nome = "Inimigo";
        vida = 50;
        dano = 15;
    }
}
