class Main {
    public static void main(String[] args) {

        FirePokemon firePokemon = new FirePokemon("Charmander", 1, "Fire");
        WaterPokemon waterPokemon = new WaterPokemon("Squirtle ", 1, "Water");
        GrassPokemon grassPokemon = new GrassPokemon("Bulbasaur", 1, "Grass", "Poison");
        ElectricPokemon electricPokemon = new ElectricPokemon("Pikachu", 1, "Electric");

        firePokemon.eats("Hot Pot a la Cube");
        waterPokemon.eats("Mouth Watering Dip a la Cube");
        grassPokemon.eats("Veggie Smoothie a la Cube");
        electricPokemon.eats("Watt a Risotto a la Cube");

        firePokemon.useAttack("Inferno", grassPokemon);

        while (firePokemon.getLevel() < 20) {
            firePokemon.levelUp();
        }

        firePokemon.evolve();

        firePokemon.setLevel(50);

        firePokemon.evolve();

        System.out.println("the fire pokemon has the following attacks: " + firePokemon.getAttackList());
        System.out.println("the water pokemon has the following attacks: " + waterPokemon.getAttackList());
        System.out.println("the grass pokemon has the following attacks: " + grassPokemon.getAttackList());
        System.out.println("the electric pokemon has the following attacks: " + electricPokemon.getAttackList());
    }
}