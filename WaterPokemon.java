import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WaterPokemon extends Pokemon {
    private final Map<String, Integer> attacks;
    public WaterPokemon(String name, int level, String... pokemonType) {
        super(name, level, pokemonType);
        attacks = new HashMap<>();
        initializeAttacks();
    }

    private void initializeAttacks() {
        attacks.put("hydroPump", 25);
        attacks.put("rainDance", 15);
        attacks.put("hydroCanon", 30);
        attacks.put("aquaJet", 20);
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
        if (getLevel() >= 20) {
            System.out.println(getName() + " is evolving into a Wartortle!");
            Pokemon waterPokemon = new WaterPokemon("Wartortle", getLevel(), "Water");
            System.out.println("waterPokemon name changed to " + waterPokemon.getName());
        } else if (getLevel() >= 45) {
            System.out.println(getName() + " is evolving into a Blastoise!");
            Pokemon waterPokemon = new WaterPokemon("Blastoise", getLevel(), "Water");
            System.out.println("waterPokemon name changed to " + waterPokemon.getName());
        } else {
            System.out.println(getName() + " is not ready to evolve yet.");
        }
    }

    @Override
    public List<String> getAttackList() {
        List<String> attackList = new ArrayList<>();
        attackList.add("hydroPump");
        attackList.add("rainDance");
        attackList.add("hydroCanon");
        attackList.add("aquaJet");
        return attackList;
    }
}
