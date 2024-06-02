

    public abstract class Character {

        //variaveis dos personagens
        public String name;
        public int maxHP, hp, xp;

        //construtor
        public Character(String name, int maxHP, int xp){
            this.name = name;
            this.maxHP = maxHP;
            this.xp = xp;
            this.hp = maxHP;
        }

        ///metodos de ataque e defesa
        public abstract int attack();
        public abstract int defend();



    }
