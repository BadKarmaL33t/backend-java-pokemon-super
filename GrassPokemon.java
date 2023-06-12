public class GrassPokemon extends Pokemon {
    public GrassPokemon(String name, int level, String... pokemonType) {
        super(name, level, pokemonType);
    }

    public void eats(String foodName) {
        super.eats(foodName);
    }

    public void leafBlade(Pokemon enemy) {
        System.out.println(getName() + " is using Leaf Blade on " + enemy.getName());
        int damage = getAttack() + 20 - enemy.getDefence();
        enemy.defence(damage);
    }

    public void leafStorm(Pokemon enemy) {
        System.out.println(getName() + " is using Leaf Storm on " + enemy.getName());
        int damage = getAttack() + 30 - enemy.getDefence();
        enemy.defence(damage);
    }

    public void solarBeam(Pokemon enemy) {
        System.out.println(getName() + " is using Solar Beam on " + enemy.getName());
        int damage = getAttack() + 25 - enemy.getDefence();
        enemy.defence(damage);
    }

    public void bulletSeed(Pokemon enemy) {
        System.out.println(getName() + " is using Bullet Seed on " + enemy.getName());
        int damage = getAttack() + 15 - enemy.getDefence();
        enemy.defence(damage);
    }

    public void evolve() {
        if (getLevel() >= 20) {
            System.out.println(getName() + " is evolving into a Ivysaur!");
            Pokemon grassPokemon = new GrassPokemon("Ivysaur", getLevel(), "Grass", "Poison");
            System.out.println("grassPokemon name changed to " + grassPokemon.getName());
        } else if (getLevel() >= 45) {
            System.out.println(getName() + " is evolving into a Venusaur!");
            Pokemon grassPokemon = new GrassPokemon("Venusaur", getLevel(), "Grass", "Poison");
            System.out.println("grassPokemon name changed to " + grassPokemon.getName());
        } else {
            System.out.println(getName() + " is not ready to evolve yet.");
        }
    }
}
