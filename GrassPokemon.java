import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GrassPokemon extends Pokemon {
    private final Map<String, Integer> attacks;

    public GrassPokemon(String name, int level, String... pokemonType) {
        super(name, level, pokemonType);
        attacks = new HashMap<>();
        initializeAttacks();
    }

    private void initializeAttacks() {
        attacks.put("leafBlade", 20);
        attacks.put("leafStorm", 30);
        attacks.put("bulletSeed", 15);
        attacks.put("solarBeam", 25);
    }

    public void eats(String foodName) {
        super.eats(foodName);
    }

    public void useAttack(String attackName, Pokemon enemy) {
        if (attacks.containsKey(attackName)) {
            System.out.println(getName() + " is using " + attackName + " on " + enemy.getName());
            int damage = getAttack() + attacks.get(attackName) - enemy.getDefence();
            enemy.defence(damage);

            if (enemy.getHp() == 0) {
                winBattle();
            }
        } else {
            System.out.println(getName() + " does not know the attack: " + attackName);
        }
    }

    public void evolve() {
        if (getLevel() >= 20 && getLevel() < 45) {
            System.out.println(getName() + " is evolving into a Ivysaur!");
            setName("Ivysaur");
            System.out.println("grassPokemon name changed to " + getName());
        } else if (getLevel() >= 45) {
            System.out.println(getName() + " is evolving into a Venusaur!");
            setName("Venusaur");
            Pokemon grassPokemon = new GrassPokemon(getName(), getLevel(), getPokemonType());
            System.out.println("grassPokemon name changed to " + getName());
        } else {
            System.out.println(getName() + " is not ready to evolve yet.");
        }
    }

    @Override
    public List<String> getAttackList() {
        List<String> attackList = new ArrayList<>();
        attackList.add("leafBlade");
        attackList.add("leafStorm");
        attackList.add("bulletSeed");
        attackList.add("solarBeam");
        return attackList;
    }
}