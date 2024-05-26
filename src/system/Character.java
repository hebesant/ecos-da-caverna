package system;

public abstract class Character {
    String name;
    int HP;

    public Character(String name, int HP){
        this.name = name;
        this.HP = HP;
    }

    public String getName(){
        return this.name;
    }

    public int getHP(){
        return this.HP;
    }

    public int receiveDamage(int damage){
        return this.HP -= damage;
    }

}
