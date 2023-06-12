public class WaterPokemon extends Pokemon {
    public WaterPokemon(String name, int level, String... pokemonType) {
        super(name, level, pokemonType);
    }

    public void eats(String foodName) {
        super.eats(foodName);
    }

    public void hydroPump(Pokemon enemy) {
        System.out.println(getName() + " is using Hydro Pump on " + enemy.getName());
        int damage = getAttack() + 20 - enemy.getDefence();
        enemy.defence(damage);
    }

    public void rainDance(Pokemon enemy) {
        System.out.println(getName() + " is using Rain Dance on " + enemy.getName());
        int damage = getAttack() + 10 - enemy.getDefence();
        enemy.defence(damage);
    }

    public void hydroCanon(Pokemon enemy) {
        System.out.println(getName() + " is using Hydro Canon on " + enemy.getName());
        int damage = getAttack() + 30 - enemy.getDefence();
        enemy.defence(damage);
    }

    public void aquaJet(Pokemon enemy) {
        System.out.println(getName() + " is using Aqua Jet on " + enemy.getName());
        int damage = getAttack() + 15 - enemy.getDefence();
        enemy.defence(damage);
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
}
