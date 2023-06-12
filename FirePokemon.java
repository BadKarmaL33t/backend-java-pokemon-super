public class FirePokemon extends Pokemon {

    public FirePokemon(String name, int level, String... pokemonType) {
        super(name, level, pokemonType);
    }

    public void eats(String foodName) {
        super.eats(foodName);
    }

    public void pyroBall(Pokemon enemy) {
        System.out.println(getName() + " is using Pyro Ball on " + enemy.getName());
        int damage = getAttack() + 20 - enemy.getDefence();
        enemy.defence(damage);
    }

    public void inferno(Pokemon enemy) {
        System.out.println(getName() + " is using Inferno on " + enemy.getName());
        int damage = getAttack() + 30 - enemy.getDefence();
        enemy.defence(damage);
    }

    public void flameThrower(Pokemon enemy) {
        System.out.println(getName() + " is using Flame Thrower on " + enemy.getName());
        int damage = getAttack() + 15 - enemy.getDefence();
        enemy.defence(damage);
    }

    public void blastBurn(Pokemon enemy) {
        System.out.println(getName() + " is using Blast Burn on " + enemy.getName());
        int damage = getAttack() + 40 - enemy.getDefence();
        enemy.defence(damage);
    }

    void evolve() {
        if (getLevel() >= 20) {
            System.out.println(getName() + " is evolving into a Charmeleon!");
            setName("Charmeleon");
            Pokemon firePokemon = new FirePokemon("Charmeleon", getLevel(), "Fire");
            System.out.println("firePokemon name changed to " + firePokemon.getName());
        } else if (getLevel() >= 50) {
            System.out.println(getName() + " is evolving into a Charizard!");
            Pokemon firePokemon = new FirePokemon("Charizard", getLevel(), "Fire", "Flying");
            System.out.println("firePokemon name changed to " + firePokemon.getName());
        } else {
            System.out.println(getName() + " is not ready to evolve yet.");
        }
    }
}

