import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElectricPokemon extends Pokemon {
    private final Map<String, Integer> attacks;
    public ElectricPokemon(String name, int level, String... pokemonType) {
        super(name, level, pokemonType);
        attacks = new HashMap<>();
        initializeAttacks();
    }

    private void initializeAttacks() {
        attacks.put("thunder", 20);
        attacks.put("thunderPunch", 15);
        attacks.put("electroBall", 25);
        attacks.put("thunderCage", 35);
    }

    public void eats(String foodName) {
        super.eats(foodName);
    }

    public void useAttack(String attackName, Pokemon enemy) {
        if (attacks.containsKey(attackName)) {
            System.out.println(getName() + " is using " + attackName + " on " + enemy.getName());
            int damage = getAttack() + attacks.get(attackName) - enemy.getDefence();
            enemy.defence(damage);
        } else {
            System.out.println(getName() + " does not know the attack: " + attackName);
        }
    }

    public void evolve() {
        if (getLevel() >= 30) {
            System.out.println(getName() + " is evolving into a Raichu!");
            Pokemon electricPokemon = new ElectricPokemon("Raichu", getLevel(), "Electric");
            System.out.println("electricPokemon name changed to " + electricPokemon.getName());
        } else {
            System.out.println(getName() + " is not ready to evolve yet.");
        }
    }
    @Override
    public List<String> getAttackList() {
        List<String> attackList = new ArrayList<>();
        attackList.add("thunder");
        attackList.add("thunderPunch");
        attackList.add("electroBall");
        attackList.add("thunderCage");
        return attackList;
    }
}

