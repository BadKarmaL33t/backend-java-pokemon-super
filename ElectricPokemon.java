public class ElectricPokemon extends Pokemon {
    public ElectricPokemon(String name, int level, String... pokemonType) {
        super(name, level, pokemonType);
    }

    public void eats(String foodName) {
        super.eats(foodName);
    }

    public void thunder(Pokemon enemy) {
        System.out.println(getName() + " is using Thunder on " + enemy.getName());
        int damage = getAttack() + 20 - enemy.getDefence();
        enemy.defence(damage);
    }

    public void thunderPunch(Pokemon enemy) {
        System.out.println(getName() + " is using Thunder Punch on " + enemy.getName());
        int damage = getAttack() + 15 - enemy.getDefence();
        enemy.defence(damage);
    }

    public void electroBall(Pokemon enemy) {
        System.out.println(getName() + " is using Electro Ball on " + enemy.getName());
        int damage = getAttack() + 25 - enemy.getDefence();
        enemy.defence(damage);
    }

    public void thunderCage(Pokemon enemy) {
        System.out.println(getName() + " is using Thunder Cage on " + enemy.getName());
        int damage = getAttack() + 30 - enemy.getDefence();
        enemy.defence(damage);
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
}

