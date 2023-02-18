/*
Joud Talal Alharbi
 */

package pokemongame;


public class PokemonBSTNode {
     private Pokemon pokemon;
    private PokemonBSTNode left, right;

    // CONSTRUCTORS
    public PokemonBSTNode() {
        left = right = null;
    }

    public PokemonBSTNode(Pokemon newData) {
       this(newData,null,null);
    }

    public PokemonBSTNode(Pokemon newPokemon, PokemonBSTNode lt, PokemonBSTNode rt) {
        pokemon = newPokemon;
        left = lt;
        right = rt;
    }
    
    // ACCESSORS
    public Pokemon getPokemon() {
        return pokemon;
    }

    public PokemonBSTNode getLeft() {
        return left;
    }
    
    public PokemonBSTNode getRight() {
        return right;
    }
    
    // MUTATORS
    public void setData(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void setLeft(PokemonBSTNode left) {
        this.left = left;
    }
    
    public void setRight(PokemonBSTNode right) {
        this.right = right;
    }
}