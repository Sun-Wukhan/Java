public class PokemonStat {

    public static void main (String[]args) {

        System.out.println("What are my Pokemon's stats");

        findPokemon("Charizard", 31);
        findPokemon("Mewtwo", 30);
        findPokemon("Pikachu", 25);
        findPokemon("Pidgey", 10);
        findPokemon("Slowbro", 15);
        findPokemon("Dragonite", 0);
    }

    public static void findPokemon(String pokemon, int stat) {
        String IV;

        if (stat == 31) {
            IV = "Best";
        } else if (stat >= 26 && stat <=30) {
            IV = "Amazing";
        } else if (stat >= 20 && stat <=26) {
            IV = "Great";
        } else if (stat >=10 && stat <=19) {
            IV = "Average";
        } else {
            IV = "Trash";
        }
        System.out.println("This Pokemon " + pokemon + " has " + IV + " stats ");
    }
}