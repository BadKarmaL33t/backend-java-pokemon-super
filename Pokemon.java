import java.util.Arrays;
import java.util.List;

abstract class Pokemon {
    private String name;
    private int level;
    private int hp;
    private final int maxHP;
    private int xp;
    private final int defence;
    private final int attack;
    private String food;
    private final int accuracy;
    private String[] pokemonType;

    public Pokemon(String name, int level, String[] pokemonType) {
        this.name = name;
        this.level = level;
        this.maxHP = level * 10;
        this.hp = maxHP;
        this.xp = 0;
        this.defence = level;
        this.attack = level * 2;
        this.accuracy = level;
        this.pokemonType = pokemonType;
    }

    public void eats(String foodName) {
        System.out.println(name + " is eating " + foodName);
        if (hp < maxHP && hp + (0.5 * maxHP) <= maxHP) {
            this.hp = (int) (hp + (0.5 * maxHP));
        } else {
            this.hp = maxHP;
        }
        System.out.println("Recovered " + hp + " HP. Current HP: " + hp);
    }

    public void attack(Pokemon enemy) {
        System.out.println(name + " is attacking " + enemy.getName());
        int damage = this.attack - enemy.getDefence();
        enemy.defence(damage);
    }

    public void defence(int damage) {
        System.out.println(name + " is defending against an attack");
        damage -= this.defence;
        this.hp -= damage;
        System.out.println("Defended against " + damage + " damage. Current HP: " + hp);
    }

    public void winBattle() {
        int xpGained = 10 * level;
        xp += xpGained;
        System.out.println(name + " won the battle and gained " + xpGained + " XP.");
        if (level < 10 && xp >= 100) {
            levelUp();
        } else if (level >= 10 && xp >= (level - 9) * 100) {
            levelUp();
        }
    }

    void levelUp() {
        level++;
        System.out.println(name + " leveled up to level " + level + "!");
        if (level % 10 == 0) {
            xp = 0;
        }
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDefence() {
        return defence;
    }

    public int getAttack() {
        return attack;
    }

    public String  getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public String[] getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(String[] pokemonType) {
        this.pokemonType = pokemonType;
    }

    abstract void evolve();

    abstract List<String> getAttackList();

    @Override
    public String toString() {
        return Arrays.toString(pokemonType);
    }
}



