class Main {
    public static void main(String[] args) {

        Pokemon firePokemon = new FirePokemon("Charmander", 1, "Fire");
        Pokemon waterPokemon = new WaterPokemon("Squirtle ", 1, "Water");
        Pokemon grassPokemon = new GrassPokemon("Bulbasaur", 1, "Grass", "Poison");
        Pokemon electricPokemon = new ElectricPokemon("Pikachu", 1, "Electric");

        firePokemon.eats("Hot Pot a la Cube");
        waterPokemon.eats("Mouth Watering Dip a la Cube");
        grassPokemon.eats("Veggie Smoothie a la Cube");
        electricPokemon.eats("Watt a Risotto a la Cube");

        firePokemon.attack(waterPokemon);
        waterPokemon.attack(grassPokemon);
        grassPokemon.attack(electricPokemon);
        electricPokemon.attack(firePokemon);

        firePokemon.winBattle();
        waterPokemon.winBattle();
        grassPokemon.winBattle();
        electricPokemon.winBattle();

        while (firePokemon.getLevel() < 20) {
            firePokemon.levelUp();
        }

        firePokemon.evolve();
    }
}