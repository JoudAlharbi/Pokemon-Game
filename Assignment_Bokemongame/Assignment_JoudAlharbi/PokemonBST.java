/*
Joud Talal Alharbi
 */

package pokemongame;


public class PokemonBST {
    private PokemonBSTNode root; // this is the root of the tree

    // Constructor	
    //...just makes an empty (null) root for tree  
    public PokemonBST() {
        root = null;  
}
 public void preorder() {
        preorder(root);
    }
    public void preorder (PokemonBSTNode p) {
     if (p != null){ 
     preorder(p.getLeft());
      System.out.println(p.getPokemon().ToString()); 
     preorder(p.getRight());
    }
   }
    
   public void insert(Pokemon pokemon) {  
          root = insert(root, pokemon);
    }

    private PokemonBSTNode insert(PokemonBSTNode p, Pokemon pokemon) {  
          if (p == null) {
            p = new PokemonBSTNode(pokemon);
          }
          else {
            if (pokemon.GetTotal()< p.getPokemon().GetTotal())
              p.setLeft(insert(p.getLeft(),pokemon));
            else
             p.setRight( insert(p.getRight(), pokemon));
          }
          return p; 
   }

}