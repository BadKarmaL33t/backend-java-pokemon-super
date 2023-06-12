import java.util.*;

public class FirePokemon extends Pokemon {
    private final Map<String, Integer> attacks;

    public FirePokemon(String name, int level, String... pokemonType) {
        super(name, level, pokemonType);
        attacks = new HashMap<>();
        initializeAttacks();
    }

    private void initializeAttacks() {
        attacks.put("PyroBall", 20);
        attacks.put("Inferno", 30);
        attacks.put("FlameThrower", 15);
        attacks.put("BlastBurn", 40);
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

    void evolve() {
        if (getLevel() >= 20 && getLevel() < 50) {
            System.out.println(getName() + " is evolving into a Charmeleon!");
            setName("Charmeleon");
            System.out.println("firePokemon name changed to " + getName());
        } else if (getLevel() >= 50) {
            System.out.println(getName() + " is evolving into a Charizard!");
            setName("Charizard");
            System.out.println("firePokemon name changed to " + getName());
            setPokemonType(new String[]{"Fire", "Flying"});
            System.out.println("firePokemon type changed to " + Arrays.toString(getPokemonType()));
        } else {
            System.out.println(getName() + " is not ready to evolve yet.");
        }
    }

    @Override
    public List<String> getAttackList() {
        List<String> attackList = new ArrayList<>();
        attackList.add("PyroBall");
        attackList.add("Inferno");
        attackList.add("FlameThrower");
        attackList.add("BlastBurn");
        return attackList;
    }
}

