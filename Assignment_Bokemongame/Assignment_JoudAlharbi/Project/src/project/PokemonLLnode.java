
package project;


public class PokemonLLnode {
    private Pokemon pokemon;
    private PokemonLLnode next;
    
    
    public PokemonLLnode(){
        pokemon=null;
        next=null;}
    
    public PokemonLLnode(Pokemon pokemon){
    this(pokemon,null);
    }
    
    public PokemonLLnode(Pokemon pokemon, PokemonLLnode next){
    this.pokemon=pokemon;
    this.next=next;}
    
    public PokemonLLnode getNext(){
    return next;}
    
    public void setNext( PokemonLLnode next){
    this.next=next;}
    
    public Pokemon getPokemon(){
    return pokemon;}
    
    public void setPokemon(Pokemon pokemon){
    this.pokemon=pokemon;}
}
